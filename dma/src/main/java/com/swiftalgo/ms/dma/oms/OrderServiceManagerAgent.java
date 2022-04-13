package com.swiftalgo.ms.dma.oms;

import com.swiftalgo.ms.dma.DmaChannels;
import com.swiftalgo.ms.dma.NewOrderSingleMethodHandler;
import com.swiftalgo.ms.entry.EntryR;
import io.aeron.*;
import io.aeron.logbuffer.FragmentHandler;
import org.agrona.concurrent.*;

public class OrderServiceManagerAgent implements Agent {

    private Aeron aeron;
    private Subscription clientOrderSubs;
    private FragmentHandler clientOrderHandler;
    EntryR entry;
    private NewOrderSingleMethodHandler newOrderSingleMethodHandler;
    int nosSeen = 0;
    final int nosToExpect;
    private final ShutdownSignalBarrier shutdownSignalBarrier;
    public OrderServiceManagerAgent(NewOrderSingleMethodHandler nosCodec, int nosToExpect, ShutdownSignalBarrier shutdownSignalBarrier) {
        this.newOrderSingleMethodHandler = nosCodec;
        this.nosToExpect = nosToExpect;
        this.shutdownSignalBarrier = shutdownSignalBarrier;
    }

    @Override
    public void onStart() {
        aeron = Aeron.connect(new Aeron.Context().aeronDirectoryName("aeron-data"));
        clientOrderSubs = aeron.addSubscription(DmaChannels.CLIENT_ORDER_CHANNEL, DmaChannels.THE_STREAM_ID);
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
}
