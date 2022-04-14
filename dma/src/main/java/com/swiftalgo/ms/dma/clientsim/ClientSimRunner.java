package com.swiftalgo.ms.dma.clientsim;

import com.swiftalgo.ms.StreamCfg;

import static com.swiftalgo.ms.dma.DmaChannels.*;

import org.agrona.concurrent.*;

public class ClientSimRunner {

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
        final ClientSimAgent clientSim = new ClientSimAgent(new SystemEpochMicroClock(), 10_000, 10000, clientStream, shutdownSignalBarrier);
        final AgentRunner runner = new AgentRunner(idleStrategy, Throwable::printStackTrace, null, clientSim);
        AgentRunner.startOnThread(runner);
        shutdownSignalBarrier.await();
        runner.close();
    }
}
