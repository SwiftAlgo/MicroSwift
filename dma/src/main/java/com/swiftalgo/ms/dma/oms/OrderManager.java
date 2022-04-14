package com.swiftalgo.ms.dma.oms;

import com.swiftalgo.ms.codecs.fix44.decoder.NewOrderSingleDecoder;
import com.swiftalgo.ms.dma.OnNewOrderSingle;

public class OrderManager implements OnNewOrderSingle {

    @Override
    public void onNewOrderSingle(NewOrderSingleDecoder nosDecoder) {
        System.out.println("Received: " + nosDecoder.toString());
    }
}
