package com.lynda.tests.o902.testingRunnable;

public class MyRunnable implements Runnable {
    @Override
    public void run() {

        int iterarions = 5;

        try {
            for (int i = 1; i < iterarions; i++) {
                System.out.println("This is runnable process");
                Thread.sleep(1500);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
