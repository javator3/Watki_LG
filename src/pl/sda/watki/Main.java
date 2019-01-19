package pl.sda.watki;

import java.util.Random;

class Runner implements Runnable{

    int silnia (int n) {
        if (n < 2) {
            return 1;
        }
        return silnia(n - 1) * n;
    }




    @Override
    public void run() {

        for (int i = 0; i<30; i++){
            System.out.println("Hello: " + i + " thread: " + Thread.currentThread().getName());
            silnia(i);
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

        Thread thread = new Thread(new Runner());
        Thread thread1 = new Thread(new Runner());

        thread.start();
        thread1.start();

        RunnerExample runnerExample = new RunnerExample();
        RunnerExample runnerExample1 = new RunnerExample();
        runnerExample.start();
        runnerExample1.start();


//        Thread thread = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 0; i<30; i++) {
//                    System.out.println("Hello: " + i + " thread: " + Thread.currentThread().getName());
//                }
//            }
//        });
//        thread.start();
//
//
//        Thread thread = new Thread(new Runnable() {
//            @Override
//            public void run() {


                Random random = new Random();
                int i = random.nextInt();

                System.out.println(i*2 + " thread: " + Thread.currentThread().getName());
                }

        });
        thread.start();

        TwoThreads twoThreads = new TwoThreads();
        TwoThreads twoThreads1 = new TwoThreads();
        twoThreads.start();
        twoThreads1.start();


    }
}