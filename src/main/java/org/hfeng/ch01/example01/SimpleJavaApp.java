package org.hfeng.ch01.example01;

import java.util.Date;

public class SimpleJavaApp {
    public static void main(String[] args) throws Exception{
        while (true) {
            System.out.println(new Date());
            Thread.sleep(1000);
        }
    }
}
