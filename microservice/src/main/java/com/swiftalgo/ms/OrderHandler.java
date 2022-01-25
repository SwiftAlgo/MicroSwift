package com.swiftalgo.ms;

import com.swiftalgo.ms.codecs.fix44.decoder.NewOrderSingleDecoder;
import io.aeron.*;
import io.aeron.logbuffer.FragmentHandler;
import org.agrona.concurrent.*;
import uk.co.real_logic.artio.util.MutableAsciiBuffer;

public class OrderHandler {

    //public static final String CLIENT_ORDER_CHANNEL = new ChannelUriStringBuilder().media(CommonContext.IPC_MEDIA).endpoint("CLIENT-ORDER").build();
    public static final String CLIENT_ORDER_CHANNEL = new ChannelUriStringBuilder().media(CommonContext.UDP_MEDIA).endpoint("localhost:12000").build();
    //public static final String MARKET_ORDER_CHANNEL = new ChannelUriStringBuilder().media(CommonContext.IPC_MEDIA).endpoint("MARKET-ORDER").build();
    public static final String MARKET_ORDER_CHANNEL = new ChannelUriStringBuilder().media(CommonContext.UDP_MEDIA).endpoint("localhost:12001").build();
    public static final int THE_STREAM_ID = 1;

    public void init(int nosToReceive) {
        try (
                final Aeron aeron = Aeron.connect(new Aeron.Context().aeronDirectoryName("aeron-data"));
                final Subscription clientOrderSubs = aeron.addSubscription(CLIENT_ORDER_CHANNEL, THE_STREAM_ID)) {
            NewOrderSingleDecoder decoder = new NewOrderSingleDecoder();
            MutableAsciiBuffer asciiBuffer = new MutableAsciiBuffer();
            FragmentHandler clientOrderHandler = (buffer, offset, length, header) -> {
                asciiBuffer.wrap(buffer);
                int decoded = decoder.decode(asciiBuffer, offset, length);
                if (decoded > 0) {
                    System.out.printf("Decoded %d bytes: msgSeq=%d, clOrdId=%s, msg=%n%s%n", decoded, decoder.header().msgSeqNum(), decoder.clOrdIDAsString(), decoder);
                }
                else {
                    System.out.printf("Decoder ERROR %d bytes%n", decoded);
                }
            };
            long dutyCycle = 1;
            int coPoll;
            int totalMsgs = 0;
            final IdleStrategy idle = new SleepingIdleStrategy();
            final EpochMicroClock clock = new SystemEpochMicroClock();
            long tsMicros = clock.microTime();
            while (totalMsgs < nosToReceive) {
                do {
                    coPoll = clientOrderSubs.poll(clientOrderHandler, 1);
                    if (dutyCycle % 1000 == 0) {
                        long newTsMicros = clock.microTime();
                        long dt = newTsMicros - tsMicros;
                        tsMicros = newTsMicros;
                        System.out.printf("dutyCycle=%d, coPoll=%d, totalMsgs=%d, dt=%d micros%n", dutyCycle, coPoll, totalMsgs, dt);
                    }
                    totalMsgs += coPoll;
                } while (coPoll > 0);
                idle.idle();
                ++dutyCycle;
            }
        }
    }

    public static void main(String[] args) {
        OrderHandler oh = new OrderHandler();
        oh.init(10);
    }
}
