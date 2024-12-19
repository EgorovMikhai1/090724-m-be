package com.app._19_12_2024;

public class Main23 {
    static T2 t2 = new T2();
    static T1 t1 = new T1();

    public static void main(String[] args) {
        t1.start();
        t2.start();
    }
}

class T1 extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 100000; i++) {
            if (i == 100) {
                Main23.t2.interrupt();
            }
        }
    }
}

class T2 extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            if (isInterrupted()) {
                System.out.println("DONE");
            }
        }
    }
}