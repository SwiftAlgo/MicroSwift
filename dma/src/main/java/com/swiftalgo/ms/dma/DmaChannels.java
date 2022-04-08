package com.swiftalgo.ms.dma;

import io.aeron.ChannelUriStringBuilder;
import io.aeron.CommonContext;

public class DmaChannels {

    //public static final String CLIENT_ORDER_CHANNEL = new ChannelUriStringBuilder().media(CommonContext.IPC_MEDIA).endpoint("CLIENT-ORDER").build();
    public static final String CLIENT_ORDER_CHANNEL = new ChannelUriStringBuilder().media(CommonContext.UDP_MEDIA).endpoint("localhost:12000").build();
    //public static final String MARKET_ORDER_CHANNEL = new ChannelUriStringBuilder().media(CommonContext.IPC_MEDIA).endpoint("MARKET-ORDER").build();
    public static final String MARKET_ORDER_CHANNEL = new ChannelUriStringBuilder().media(CommonContext.UDP_MEDIA).endpoint("localhost:12001").build();
    public static final int THE_STREAM_ID = 1;
}
