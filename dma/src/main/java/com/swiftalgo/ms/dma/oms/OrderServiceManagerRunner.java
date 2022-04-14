package com.swiftalgo.ms.dma.oms;

import com.swiftalgo.ms.MethodWriterContext;
import com.swiftalgo.ms.StreamCfg;
import com.swiftalgo.ms.dma.NewOrderSingleMethodHandler;
import org.agrona.concurrent.*;

import java.nio.ByteBuffer;

import static com.swiftalgo.ms.dma.DmaChannels.*;
import static com.swiftalgo.ms.dma.DmaChannels.CLIENT_ORDER_CONTROL_RESPONSE_STREAMID;

public class OrderServiceManagerRunner {

    public static void main(String[] args) {
        StreamCfg clientStream = new StreamCfg(
                CLIENT_ORDER_CHANNEL,
                CLIENT_ORDER_STREAM_ID,
                "localhost",
                CLIENT_ORDER_CONTROL_REQUEST_CHANNEL,
                CLIENT_ORDER_CONTROL_REQUEST_STREAMID,
                CLIENT_ORDER_CONTROL_RESPONSE_CHANNEL,
                CLIENT_ORDER_CONTROL_RESPONSE_STREAMID,
                CLIENT_ORDER_REPLAY_STREAMID);
        final IdleStrategy idleStrategy = new BackoffIdleStrategy();
        ShutdownSignalBarrier shutdownSignalBarrier = new ShutdownSignalBarrier();
        MethodWriterContext methodWriterContext = new MethodWriterContext(new UnsafeBuffer(ByteBuffer.allocate(256)));
        OrderManager oms = new OrderManager();
        NewOrderSingleMethodHandler nosCodec = new NewOrderSingleMethodHandler(methodWriterContext, oms);
        final OrderServiceManagerAgent orderServiceManagerAgent = new OrderServiceManagerAgent(nosCodec, 10_000, clientStream, shutdownSignalBarrier);
        final AgentRunner runner = new AgentRunner(idleStrategy, Throwable::printStackTrace, null, orderServiceManagerAgent);
        AgentRunner.startOnThread(runner);
        shutdownSignalBarrier.await();
        runner.close();
    }
}
