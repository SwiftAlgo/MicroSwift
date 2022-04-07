package com.swiftalgo.ms;

import org.agrona.DirectBuffer;

public class MethodWriterContext {

    private DirectBuffer buffer;
    private int offset;
    private int length;

    public MethodWriterContext(DirectBuffer buffer) {
        this.buffer = buffer;
    }

    public DirectBuffer buffer() {
        return buffer;
    }

    public int offset() {
        return offset;
    }

    public MethodWriterContext offset(int offset) {
        this.offset = offset;
        return this;
    }

    public int length() {
        return length;
    }

    public MethodWriterContext length(int length) {
        this.length = length;
        return this;
    }
}
