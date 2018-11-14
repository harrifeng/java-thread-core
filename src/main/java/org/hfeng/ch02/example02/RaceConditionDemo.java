package org.hfeng.ch02.example02;

import org.hfeng.ch02.example01.RequestIDGenerator;
import org.hfeng.util.Tools;

public class RaceConditionDemo {
    public static void main(String[] args) {
        int numOfThreads = args.length > 0 ? Short.valueOf(args[0]) : Runtime.getRuntime().availableProcessors();
        Thread[] workerThreads = new Thread[numOfThreads];
        for (int i = 0; i < numOfThreads; i++) {
            workerThreads[i] = new WorkerThread(i, 10);
        }
        // start once
        for (Thread ct: workerThreads) {
            ct.start();
        }
    }


    static class WorkerThread extends Thread {
        private final int requestCount;

        public WorkerThread(int id, int requestCount) {
            super("worker-" + id);
            this.requestCount = requestCount;
        }

        @Override
        public void run() {
            int i = requestCount;
            String requestID;
            RequestIDGenerator requestIDGenerator = RequestIDGenerator.getInstance();
            while (i-- > 0) {
                requestID = requestIDGenerator.nextID();
                processRequest(requestID);
            }
        }

        private void processRequest(String requestID) {
            Tools.randomPause(50);
            System.out.printf("%s got requestID: %s %n",
                    Thread.currentThread().getName(), requestID);
        }
    }
}
