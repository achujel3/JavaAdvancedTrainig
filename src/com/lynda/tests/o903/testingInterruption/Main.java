package com.lynda.tests.o903.testingInterruption;

public class Main {

    public static void main(String[] args) {

        AnotherThread anotherThread = new AnotherThread();
        anotherThread.start();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // interrupting thread
        anotherThread.interrupt();
        System.out.println("Thread interrupted");

    }

}
