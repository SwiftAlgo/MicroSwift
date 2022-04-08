package com.swiftalgo.ms.dma;

import com.swiftalgo.ms.codecs.fix44.decoder.NewOrderSingleDecoder;

public interface OnNewOrderSingle {

    void onNewOrderSingle(NewOrderSingleDecoder nosDecoder);

}
