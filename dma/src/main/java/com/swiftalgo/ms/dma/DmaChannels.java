package com.swiftalgo.ms.dma;

import io.aeron.ChannelUriStringBuilder;
import io.aeron.CommonContext;

public class DmaChannels {

    public static final int CLIENT_ORDER_PORT = 12000;
    public static final int CLIENT_ORDER_CONTROL_REQUEST_CHANNEL_PORT = 12001;
    public static final int CLIENT_ORDER_CONTROL_RESPONSE_CHANNEL_PORT = 12002;

    public static final String CLIENT_ORDER_CONTROL_REQUEST_CHANNEL = new ChannelUriStringBuilder().media(CommonContext.UDP_MEDIA).endpoint("localhost:" + CLIENT_ORDER_CONTROL_REQUEST_CHANNEL_PORT).build();
    public static final String CLIENT_ORDER_CONTROL_RESPONSE_CHANNEL = new ChannelUriStringBuilder().media(CommonContext.UDP_MEDIA).endpoint("localhost:" + CLIENT_ORDER_CONTROL_RESPONSE_CHANNEL_PORT).build();

    public static final int CLIENT_ORDER_CONTROL_REQUEST_STREAMID = 10;
    public static final int CLIENT_ORDER_CONTROL_RESPONSE_STREAMID = 11;
    public static final int CLIENT_ORDER_STREAM_ID = 16;
    public static final int CLIENT_ORDER_REPLAY_STREAMID = 17;


    //public static final String CLIENT_ORDER_CHANNEL = new ChannelUriStringBuilder().media(CommonContext.IPC_MEDIA).endpoint("CLIENT-ORDER").build();
    public static final String CLIENT_ORDER_CHANNEL = new ChannelUriStringBuilder().media(CommonContext.UDP_MEDIA).endpoint("localhost:" + CLIENT_ORDER_PORT).build();
    //public static final String MARKET_ORDER_CHANNEL = new ChannelUriStringBuilder().media(CommonContext.IPC_MEDIA).endpoint("MARKET-ORDER").build();
    public static final String MARKET_ORDER_CHANNEL = new ChannelUriStringBuilder().media(CommonContext.UDP_MEDIA).endpoint("localhost:13001").build();
}
