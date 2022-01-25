package com.swiftalgo.ms;

import com.swiftalgo.ms.codecs.fix44.builder.NewOrderSingleEncoder;
import com.swiftalgo.ms.codecs.fix44.decoder.NewOrderSingleDecoder;
import io.aeron.Aeron;
import io.aeron.ExclusivePublication;
import org.agrona.concurrent.IdleStrategy;
import org.agrona.concurrent.SleepingIdleStrategy;
import org.agrona.concurrent.UnsafeBuffer;
import uk.co.real_logic.artio.builder.Encoder;
import uk.co.real_logic.artio.util.AsciiBuffer;
import uk.co.real_logic.artio.util.MutableAsciiBuffer;

import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;

import static com.swiftalgo.ms.OrderHandler.*;

public class ClientSimulator {

    public void init(int nosToSend) {
        try (
                final Aeron aeron = Aeron.connect(new Aeron.Context().aeronDirectoryName("aeron-data"));
                final ExclusivePublication clientOrderPub = aeron.addExclusivePublication(CLIENT_ORDER_CHANNEL, THE_STREAM_ID);
        ) {
            final IdleStrategy idle = new SleepingIdleStrategy();


            UnsafeBuffer unsafeBuffer = new UnsafeBuffer(ByteBuffer.allocate(256));
            MutableAsciiBuffer asciiBuffer = new MutableAsciiBuffer(unsafeBuffer);
            NewOrderSingleEncoder nosEncoder = createEncoderWithBaseNOS();

            int clientMsgsSent = 0;
            while (clientMsgsSent < nosToSend) {
                int connectedCount = 0;
                if (clientOrderPub.isConnected()) {
                    String clOrdId = String.format("ClOrdID-%03d", clientMsgsSent);
                    nosEncoder.clOrdID(clOrdId);
                    nosEncoder.header().msgSeqNum(clientMsgsSent);
                    long lengthOffset = nosEncoder.encode(asciiBuffer, 0);
                    int length = Encoder.length(lengthOffset);
                    int startPos = Encoder.offset(lengthOffset);
                    System.out.println("Sending: " + clOrdId);
                    if (clientOrderPub.offer(unsafeBuffer, startPos, length) > 0L) {
                        ++clientMsgsSent;
                    }
                    ++connectedCount;
                }

                if (connectedCount == 0) {
                    idle.idle();
                }
                System.out.println("clientMsgsSent=" + clientMsgsSent);
            }
        }
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

    public static void main(String[] args) {
        ClientSimulator cs = new ClientSimulator();
        cs.init(10);
    }
}
