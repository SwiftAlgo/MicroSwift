package com.swiftalgo.ms.dma.clientsim;

import com.swiftalgo.ms.StreamCfg;
import com.swiftalgo.ms.codecs.fix44.builder.NewOrderSingleEncoder;
import com.swiftalgo.ms.codecs.fix44.decoder.NewOrderSingleDecoder;
import com.swiftalgo.ms.entry.EntryRW;
import io.aeron.Aeron;
import io.aeron.ExclusivePublication;
import io.aeron.archive.client.AeronArchive;
import io.aeron.archive.codecs.SourceLocation;
import org.agrona.concurrent.*;
import uk.co.real_logic.artio.builder.Encoder;
import uk.co.real_logic.artio.util.AsciiBuffer;
import uk.co.real_logic.artio.util.MutableAsciiBuffer;

import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;

public class ClientSimAgent implements Agent {

    private Aeron aeron;
    private AeronArchive aeronArchive;
    private ExclusivePublication clientOrderPub;
    int clientMsgsSent = 0;
    final EpochMicroClock clock;
    long arrivalEpochMicros = 0;
    final int nosToSend;
    int interSendTimeMicros;
    NewOrderSingleEncoder nosEncoder;
    EntryRW entry;
    MutableAsciiBuffer asciiFixMsgBuffer;
    UnsafeBuffer msgBuffer;
    final ShutdownSignalBarrier shutdownSignalBarrier;
    final StreamCfg clientStream;

    public ClientSimAgent(EpochMicroClock clock, int nosToSend, int interSendTimeMicros, StreamCfg clientStream, ShutdownSignalBarrier shutdownSignalBarrier) {
        this.clock = clock;
        this.nosToSend = nosToSend;
        this.interSendTimeMicros = interSendTimeMicros;
        this.clientStream = clientStream;
        this.shutdownSignalBarrier = shutdownSignalBarrier;
    }

    @Override
    public void onStart() {
        aeron = Aeron.connect(new Aeron.Context().aeronDirectoryName("aeron-data"));
        aeronArchive = AeronArchive.connect(new AeronArchive.Context().aeron(aeron));
        aeronArchive.startRecording(clientStream.channel(), clientStream.streamID(), SourceLocation.LOCAL);
        clientOrderPub = aeron.addExclusivePublication(clientStream.channel(), clientStream.streamID());
        msgBuffer = new UnsafeBuffer(ByteBuffer.allocate(256));
        UnsafeBuffer fixMsgBuffer = new UnsafeBuffer(ByteBuffer.allocate(256));
        asciiFixMsgBuffer = new MutableAsciiBuffer(fixMsgBuffer);
        nosEncoder = createEncoderWithBaseNOS();
        entry = new EntryRW();
        entry.wrap(msgBuffer, 0);
    }

    @Override
    public int doWork() {
        long currentEpochMicros = clock.microTime();
        if (arrivalEpochMicros == 0) {
            arrivalEpochMicros = currentEpochMicros;
        }

        int targetNosToSendByNow = Math.min(((int) (currentEpochMicros - arrivalEpochMicros)) / interSendTimeMicros, nosToSend);
        int sent = 0;
        while (clientMsgsSent < targetNosToSendByNow) {
            String clOrdId = String.format("ClOrdID-%03d", clientMsgsSent);
            nosEncoder.clOrdID(clOrdId);
            nosEncoder.header().msgSeqNum(clientMsgsSent);
            long lengthOffset = nosEncoder.encode(asciiFixMsgBuffer, 0);
            int fixLength = Encoder.length(lengthOffset);
            int fixStartPos = Encoder.offset(lengthOffset);
            entry.seq(clientMsgsSent);
            entry.epochMicros(clock.microTime());
            entry.methodId(1);
            entry.writePayLoad(asciiFixMsgBuffer, fixStartPos, fixLength);
            long offerResult = clientOrderPub.offer(msgBuffer, 0, entry.length());
            if (offerResult > 0L) {
                ++clientMsgsSent;
                ++sent;
            } else {
                System.out.printf("offerResult=%d%n", offerResult);
                break;
            }
        }
        if (clientMsgsSent >= nosToSend) {
            shutdownSignalBarrier.signal();
        }
        if (sent > 0) {
            System.out.printf("Sent %d%n", sent);
        }
        return sent;
    }


    static void generateNOSUsingString() {
        NewOrderSingleDecoder decoder = new NewOrderSingleDecoder();
        UnsafeBuffer unsafeBuffer = new UnsafeBuffer(ByteBuffer.allocate(256));
        String clOrdId = "ClOrdId001";
        String time = "20220122-12:58:29.123456789";
        String nosFix = String.format("8=FIX.4.4\0019=BodyLength\00135=D\00134=123456\00149=SIM_COMPID\00152=%s\00156=DMA_COMPID\00111=%s\00138=10000\00140=2\00144=150.0\00154=2\00155=CNA.L\00160=%s\00110=ABC\001"
                , time, clOrdId, time);
        int bodyLength = nosFix.length() - "8=FIX.4.4\0019=BodyLength".length();
        nosFix = nosFix.replaceFirst("BodyLength", Integer.toString(bodyLength));
        byte[] nosFixByteArray = nosFix.getBytes(StandardCharsets.US_ASCII);
        unsafeBuffer.putBytes(0, nosFixByteArray);

        AsciiBuffer asciiBuffer = new MutableAsciiBuffer(unsafeBuffer);
        int decoded = decoder.decode(asciiBuffer, 0, nosFixByteArray.length);
        System.out.printf("Decoded %d as:\n%s%n", decoded, decoder);
        System.out.printf("Validate=%b, invalidTag=%d, reason=%s", decoder.validate(), decoder.invalidTagId(), decoder.rejectReason());
    }

    static NewOrderSingleEncoder createEncoderWithBaseNOS() {
        String time = "20220122-12:58:29.123456789";
        NewOrderSingleEncoder encoder = new NewOrderSingleEncoder();
        encoder.header().msgSeqNum(1).senderCompID("SIM_COMPID").targetCompID("DMA_COMPID").sendingTime(time.getBytes(StandardCharsets.US_ASCII));
        encoder.clOrdID("MyClOrdID-001");
        encoder.orderQtyData().orderQty(100000L, 0);
        encoder.ordType('2');
        encoder.price(5566000000L, 8);
        encoder.side('2');
        encoder.instrument().symbol("CNA.L");
        encoder.transactTime(time.getBytes(StandardCharsets.US_ASCII));
        return encoder;
    }

    @Override
    public void onClose() {
        clientOrderPub.close();
        aeronArchive.close();
        aeron.close();
    }

    @Override
    public String roleName() {
        return getClass().getSimpleName();
    }

}
