package com.lynda.tests.o901.testingThreads;

public class MyThread extends Thread {

    @Override
    public void run() {
        int iterations = 5;

        try {
            for (int i = 1; i < iterations; i++) {
                System.out.println("secondary process");
                sleep(2000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
