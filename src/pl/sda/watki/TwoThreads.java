package pl.sda.watki;

import java.util.Random;

public class TwoThreads extends Thread {

    public void run(){

        Random random = new Random();
        int i = random.nextInt();
        int j = i * i;
        System.out.println("Losowa liczba: " + i + " podwojona wartość to: " + j + " wątek: " + Thread.currentThread().getName());

    }
}