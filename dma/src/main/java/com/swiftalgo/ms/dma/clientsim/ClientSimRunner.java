package com.swiftalgo.ms.dma.clientsim;

import org.agrona.concurrent.*;

public class ClientSimRunner {

    public static void main(String[] args) {
        final IdleStrategy idleStrategy = new BackoffIdleStrategy();
        ShutdownSignalBarrier shutdownSignalBarrier = new ShutdownSignalBarrier();
        final ClientSimAgent clientSim = new ClientSimAgent(new SystemEpochMicroClock(), 10_000, 10, shutdownSignalBarrier);
        final AgentRunner runner = new AgentRunner(idleStrategy, Throwable::printStackTrace, null, clientSim);
        AgentRunner.startOnThread(runner);
        shutdownSignalBarrier.await();
        runner.close();
    }
}
