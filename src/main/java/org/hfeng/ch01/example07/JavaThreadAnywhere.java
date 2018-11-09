package org.hfeng.ch01.example07;

public class JavaThreadAnywhere {
    public static void main(String[] args) {
        Thread currentThread = Thread.currentThread();
        String currentThreadName = currentThread.getName();
        System.out.printf("The main method was executed by thread: %s\n", currentThreadName);

        Helper helper = new Helper("Java Thread AnyWhere");
        helper.run();
    }

    static class Helper implements Runnable {
        private final String message;

        public Helper(String message) {
            this.message = message;
        }

        private void doSomething(String message) {
            Thread currentThread = Thread.currentThread();

            String currentThreadName = currentThread.getName();
            System.out.printf("The doSomething method was executed by thread : %s\n", currentThreadName);
            System.out.println("Do something with " + message);
        }

        @Override
        public void run() {
            doSomething(message);
        }
    }
}
