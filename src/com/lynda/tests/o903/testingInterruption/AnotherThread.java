package com.lynda.tests.o903.testingInterruption;

public class AnotherThread extends Thread {

    @Override
    public void run() {
        int iterations = 5;

        try {
            for (int i = 0; i < iterations; i++) {
                System.out.println("secondary process");
                sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }
    }
}
