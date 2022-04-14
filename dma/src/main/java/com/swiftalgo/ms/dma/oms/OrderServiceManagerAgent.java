package com.swiftalgo.ms.dma.oms;

import com.swiftalgo.ms.StreamCfg;
import com.swiftalgo.ms.dma.DmaChannels;
import com.swiftalgo.ms.dma.NewOrderSingleMethodHandler;
import com.swiftalgo.ms.entry.EntryR;
import io.aeron.*;
import io.aeron.archive.client.AeronArchive;
import io.aeron.archive.client.RecordingDescriptorConsumer;
import io.aeron.logbuffer.FragmentHandler;
import org.agrona.collections.MutableLong;
import org.agrona.concurrent.*;

public class OrderServiceManagerAgent implements Agent {

    private Aeron aeron;
    private AeronArchive aeronArchive;
    private Subscription clientOrderSubs;
    private FragmentHandler clientOrderHandler;
    EntryR entry;
    private NewOrderSingleMethodHandler newOrderSingleMethodHandler;
    int nosSeen = 0;
    final int nosToExpect;
    private final StreamCfg clientStream;
    private final ShutdownSignalBarrier shutdownSignalBarrier;

    public OrderServiceManagerAgent(NewOrderSingleMethodHandler nosCodec, int nosToExpect, StreamCfg clientStream, ShutdownSignalBarrier shutdownSignalBarrier) {
        this.newOrderSingleMethodHandler = nosCodec;
        this.nosToExpect = nosToExpect;
        this.clientStream = clientStream;
        this.shutdownSignalBarrier = shutdownSignalBarrier;
    }

    @Override
    public void onStart() {
        aeron = Aeron.connect(new Aeron.Context().aeronDirectoryName("aeron-data"));
        aeronArchive = AeronArchive.connect(new AeronArchive.Context().aeron(aeron));

        final long recordingId = findLatestRecording(aeronArchive, clientStream.channel(), clientStream.streamID());
        final long sessionId = aeronArchive.startReplay(recordingId, 0L, Long.MAX_VALUE, clientStream.channel(), clientStream.replayStreamID());
        final String channelRead = ChannelUri.addSessionId(clientStream.channel(), (int) sessionId);

        clientOrderSubs = aeron.addSubscription(channelRead, clientStream.replayStreamID());
        entry = new EntryR();
        clientOrderHandler = (buffer, offset, length, header) -> {
            entry.wrap(buffer, offset);
            switch (entry.methodId()) {
                case 1:
                    this.newOrderSingleMethodHandler.decodeAndInvoke(buffer, entry.payloadOffset(), entry.payloadLength());
                    break;
            }
        };
    }

    @Override
    public int doWork() {
        int totalFragments = 0;
        int fragmentsThisPoll;
        do {
            fragmentsThisPoll = clientOrderSubs.poll(clientOrderHandler, 1);
            totalFragments += fragmentsThisPoll;
        }
        while (fragmentsThisPoll > 0);
        nosSeen += totalFragments;
        System.out.printf("Received %d / %d Expected%n", nosSeen, nosToExpect);
        if (nosSeen >= nosToExpect) {
            shutdownSignalBarrier.signal();
        }
        return fragmentsThisPoll;
    }

    @Override
    public void onClose() {
        clientOrderSubs.close();
        aeron.close();
    }

    @Override
    public String roleName() {
        return getClass().getSimpleName();
    }

    private long findLatestRecording(final AeronArchive archive, String channel, int stream)
    {
        final MutableLong lastRecordingId = new MutableLong();

        final RecordingDescriptorConsumer consumer =
                (controlSessionId, correlationId, recordingId,
                 startTimestamp, stopTimestamp, startPosition,
                 stopPosition, initialTermId, segmentFileLength,
                 termBufferLength, mtuLength, sessionId,
                 streamId, strippedChannel, originalChannel,
                 sourceIdentity) -> lastRecordingId.set(recordingId);

        final long fromRecordingId = 0L;
        final int recordCount = 100;

        final int foundCount = archive.listRecordingsForUri(fromRecordingId, recordCount, channel, stream, consumer);

        if (foundCount == 0)
        {
            throw new IllegalStateException("no recordings found");
        }

        return lastRecordingId.get();
    }
}
