package com.swiftalgo.ms.dma;

import com.swiftalgo.ms.MethodHandler;
import com.swiftalgo.ms.MethodWriterContext;
import com.swiftalgo.ms.codecs.fix44.builder.NewOrderSingleEncoder;
import com.swiftalgo.ms.codecs.fix44.decoder.NewOrderSingleDecoder;
import org.agrona.DirectBuffer;
import uk.co.real_logic.artio.builder.Encoder;
import uk.co.real_logic.artio.util.MutableAsciiBuffer;

public class NewOrderSingleMethodHandler implements MethodHandler, OnNewOrderSingle {

    private final MethodWriterContext ctx;
    private final OnNewOrderSingle invokeOnDecode;
    private final NewOrderSingleDecoder nosDecoder;
    private final MutableAsciiBuffer asciiBuffer;
    private final NewOrderSingleEncoder nosEncoder;

    public NewOrderSingleMethodHandler(MethodWriterContext ctx, OnNewOrderSingle invokeOnDecode) {
        this.ctx = ctx;
        this.invokeOnDecode = invokeOnDecode;
        nosDecoder = new NewOrderSingleDecoder();
        nosEncoder = new NewOrderSingleEncoder();
        asciiBuffer = new MutableAsciiBuffer();
    }

    @Override
    public void decodeAndInvoke(DirectBuffer buffer, int offset, int length) {
        asciiBuffer.wrap(buffer, offset, length);
        int decoded = nosDecoder.decode(asciiBuffer, 0, length);
        if (decoded > 0) {
            invokeOnDecode.onNewOrderSingle(nosDecoder);
            System.out.printf("Decoded %d bytes: msgSeq=%d, clOrdId=%s, msg=%n%s%n", decoded, nosDecoder.header().msgSeqNum(), nosDecoder.clOrdIDAsString(), nosDecoder);
        } else {
            System.out.printf("Decoder ERROR %d bytes%n", decoded);
            throw new RuntimeException(String.format("decoded=%d", decoded));
        }
    }

    @Override
    public void onNewOrderSingle(NewOrderSingleDecoder nosDecoder) {
        nosDecoder.toEncoder(nosEncoder);
        long lengthOffset = nosEncoder.encode(asciiBuffer, 0); //TODO Assume it's safe to re-use same ASCII buffer.
        int fixLength = Encoder.length(lengthOffset);
        int fixStartPos = Encoder.offset(lengthOffset);
        ctx.offset(fixStartPos).length(fixLength);
    }
}
