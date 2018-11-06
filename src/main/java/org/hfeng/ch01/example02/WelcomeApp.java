package org.hfeng.ch01.example02;

public class WelcomeApp {
    public static void main(String[] args) {
        Thread welcomeThread = new WelcomeThread();
        welcomeThread.start();

        System.out.printf("1.Welcome! I'm %s.%n", Thread.currentThread().getName());
    }
}

class WelcomeThread extends Thread {
    @Override
    public void run() {
        System.out.printf("2.Welcome! I'm %s.%n", Thread.currentThread().getName());
    }
}

// <===================OUTPUT===================>
// 1.Welcome! I'm main.
// 2.Welcome! I'm Thread-0.

// <===================OUTPUT===================>
// 2.Welcome! I'm Thread-0.
// 1.Welcome! I'm main.
