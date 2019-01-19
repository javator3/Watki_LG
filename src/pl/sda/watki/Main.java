package pl.sda.watki;

import java.util.Random;

class Runner implements Runnable {

    @Override
    public void run() {

        for (int i = 0; i < 10; i++) {
            System.out.println("Hello: " + i + " thread: " + Thread.currentThread().getName());
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}

public class Main {

    public static void main(String[] args) {

//        TwoThreads twoThreads = new TwoThreads();
//        TwoThreads twoThreads1 = new TwoThreads();
//        twoThreads.start();
//        twoThreads1.start();
    }
}