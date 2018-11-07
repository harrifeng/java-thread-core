package org.hfeng.misc.example01;

import org.hfeng.util.Tools;

public class DemoJoin {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new DemoThread());
        thread1.start();

        try {
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Main Thread is finished");
    }
}

class DemoThread implements Runnable {
    @Override
    public void run() {
        Tools.randomPause(1000);
        System.out.println("Demo Thread is finished");
    }
}

// <===================OUTPUT===================>
// Demo Thread is finished
// Main Thread is finished
