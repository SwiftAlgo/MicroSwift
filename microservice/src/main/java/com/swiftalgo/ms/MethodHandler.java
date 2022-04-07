package com.swiftalgo.ms;

import org.agrona.DirectBuffer;

public interface MethodHandler {

    void decodeAndInvoke(DirectBuffer buffer, int offset, int length);

}
