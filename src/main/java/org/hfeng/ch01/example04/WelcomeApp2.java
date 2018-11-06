package org.hfeng.ch01.example04;

public class WelcomeApp2 {
    public static void main(String[] args) {
        Thread welcomeThread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.printf("2.Welcome! I'm %s.%n", Thread.currentThread().getName());
            }
        });

        welcomeThread.start();
        welcomeThread.run();

        System.out.printf("1.Welcome! I'm %s.%n", Thread.currentThread().getName());
    }
}

