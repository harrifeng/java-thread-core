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

// <===================OUTPUT===================>
// Tue Nov 06 09:23:12 UTC 2018
// Tue Nov 06 09:23:13 UTC 2018
// Tue Nov 06 09:23:14 UTC 2018
// Tue Nov 06 09:23:15 UTC 2018
// ...
