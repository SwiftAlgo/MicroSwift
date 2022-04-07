package com.swiftalgo.ms.entry;

import org.agrona.DirectBuffer;
import org.agrona.MutableDirectBuffer;

import java.util.Objects;

public class Entry<T extends DirectBuffer> {
    protected static final int SEQ_OFFSET = 0;
    protected static final int EPOCH_MICROS_OFFSET = 8;
    protected static final int METHOD_ID_OFFSET = 16;
    protected static final int PAYLOAD_LENGTH_OFFSET = 20;
    protected static final int PAYLOAD_OFFSET = 24;
    protected T buffer;
    protected int offset;

    public Entry() {}

    public void wrap(T directBuffer, int offset) {
        this.buffer = Objects.requireNonNull(directBuffer);
        this.offset = offset;
    }

    public long seq() {
        return buffer.getLong(offset + SEQ_OFFSET);
    }

    public long epochMicros() {
        return buffer.getLong(offset + EPOCH_MICROS_OFFSET);
    }

    public int methodId() {
        return buffer.getInt(offset + METHOD_ID_OFFSET);
    }

    /**
     * offset + PAYLOAD_OFFSET.
     * @return
     */
    public int payloadOffset() { return offset + PAYLOAD_OFFSET;}

    public int payloadLength() {
        return this.buffer.getInt(offset + PAYLOAD_LENGTH_OFFSET);
    }



    public int readPayload(MutableDirectBuffer target, int targetOffset) {
        int payloadLength = payloadLength();
        target.putBytes(targetOffset, buffer, offset + PAYLOAD_OFFSET, payloadLength);
        return payloadLength;
    }

    public int length() {
        return PAYLOAD_OFFSET + payloadLength();
    }

    public String toString() {
        return String.format("seq=%d, epochMicros=%d, methodId=%d, payloadLength=%d", seq(), epochMicros(), methodId(), payloadLength());
    }

}
