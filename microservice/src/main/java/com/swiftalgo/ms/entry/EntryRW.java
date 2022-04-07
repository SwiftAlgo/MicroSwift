package com.swiftalgo.ms.entry;

import org.agrona.DirectBuffer;
import org.agrona.MutableDirectBuffer;

public class EntryRW extends Entry<MutableDirectBuffer> {

    public EntryRW() {}

    public void wrap(MutableDirectBuffer mutableBuffer, int offset) {
        super.wrap(mutableBuffer, offset);
    }

    public void reset() {
        seq(0L);
        epochMicros(0L);
        methodId(0);
        payloadLength(0);
    }

    public void seq(long id) {
        buffer.putLong(offset + SEQ_OFFSET, id);
    }

    public void epochMicros(long epochMicros) {
        buffer.putLong(offset + EPOCH_MICROS_OFFSET, epochMicros);
    }

    public void methodId(int id) {
        buffer.putInt(offset + METHOD_ID_OFFSET, id);
    }

    public void payloadLength(int length) {
        this.buffer.putInt(offset + PAYLOAD_LENGTH_OFFSET, length);
    }

    public void writePayLoad(DirectBuffer srcBuffer, int srcIndex, int length) {
        payloadLength(length);
        this.buffer.putBytes(offset + PAYLOAD_OFFSET, srcBuffer, srcIndex, length);
    }
}
