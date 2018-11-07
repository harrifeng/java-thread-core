package org.hfeng.ch01.example06;

public class SimpleTimer {
    private static int count;

    public static void main(String[] args) {
        count = args.length >= 1 ? Integer.valueOf(args[0]) : 10;
        int remaining;
        while (true) {
            remaining = countDown();

            if (0 == remaining) {
                break;
            } else {
                System.out.println("Remaining " + count + " second(s)");
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {

            }
            System.out.println("Done.");
        }

    }

    private static int countDown() {
        return count--;
    }
}
