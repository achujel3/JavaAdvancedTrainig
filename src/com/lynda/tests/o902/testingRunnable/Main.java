package com.lynda.tests.o902.testingRunnable;

import com.lynda.tests.o901.testingThreads.MyThread;

import static java.lang.Thread.sleep;

public class Main {

    public static void main(String[] args) {

        MyThread myThread = new MyThread();
        myThread.start();

        MyRunnable myRunnable = new MyRunnable();
        new Thread(myRunnable).start();

        int iterarions = 3;

        try {
            for (int i = 1; i < iterarions; i++) {
                System.out.println("This is main process");
                sleep(3000);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
