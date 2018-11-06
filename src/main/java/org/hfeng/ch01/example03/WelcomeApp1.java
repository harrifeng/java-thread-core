package org.hfeng.ch01.example03;

public class WelcomeApp1 {
    public static void main(String[] args) {
        Thread welcomeThread = new Thread(new WelcomeTask());
        welcomeThread.start();
        System.out.printf("1.Welcome! I'm %s.%n", Thread.currentThread().getName());
    }
}

class WelcomeTask implements Runnable {
    @Override
    public void run() {
        System.out.printf("2.Welcome! I'm %s.%n", Thread.currentThread().getName());
    }
}


