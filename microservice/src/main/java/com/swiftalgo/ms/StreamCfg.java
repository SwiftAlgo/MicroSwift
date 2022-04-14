package com.swiftalgo.ms;

public class StreamCfg {

    private final String channel;
    private final int streamID;
    private final String archiveHost;
    private final String controlRequestChannel;
    private final int controlRequestStreamID;
    private final String controlResponseChannel;
    private final int controlResponseStreamID;
    private final int replayStreamID;

    public StreamCfg(String channel, int streamID, String archiveHost, String controlRequestChannel, int controlRequestStreamID, String controlResponseChannel, int controlResponseStreamID, int replayStreamID) {
        this.channel = channel;
        this.streamID = streamID;
        this.archiveHost = archiveHost;
        this.controlRequestChannel = controlRequestChannel;
        this.controlRequestStreamID = controlRequestStreamID;
        this.controlResponseChannel = controlResponseChannel;
        this.controlResponseStreamID = controlResponseStreamID;
        this.replayStreamID = replayStreamID;
    }

    public String archiveHost() {
        return archiveHost;
    }

    public int controlRequestStreamID() {
        return controlRequestStreamID;
    }

    public String channel() {
        return channel;
    }

    public int streamID() {
        return streamID;
    }

    public int replayStreamID() {
        return replayStreamID;
    }

}
