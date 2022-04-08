package com.swiftalgo.ms.dma.oms;

import com.swiftalgo.ms.MethodWriterContext;
import com.swiftalgo.ms.dma.NewOrderSingleMethodHandler;
import org.agrona.concurrent.*;

import java.nio.ByteBuffer;

public class OrderServiceManagerRunner {

    public static void main(String[] args) {
        final IdleStrategy idleStrategy = new BackoffIdleStrategy();
        ShutdownSignalBarrier shutdownSignalBarrier = new ShutdownSignalBarrier();
        MethodWriterContext methodWriterContext = new MethodWriterContext(new UnsafeBuffer(ByteBuffer.allocate(256)));
        NewOrderSingleMethodHandler nosCodec = new NewOrderSingleMethodHandler(methodWriterContext, nos-> System.out.println("Received: " + nos.toString()));
        final OrderServiceManager orderServiceManager = new OrderServiceManager(nosCodec, 10_000, shutdownSignalBarrier);
        final AgentRunner runner = new AgentRunner(idleStrategy, Throwable::printStackTrace, null, orderServiceManager);
        AgentRunner.startOnThread(runner);
        shutdownSignalBarrier.await();
        runner.close();
    }
}
