package com.lynda.tests.o904.testingSynchronized;

public class Main {

    public static void main(String[] args) {

        TargetClass targetClass = new TargetClass();

        MyThread myThread1 = new MyThread(1, targetClass);
        MyThread myThread2 = new MyThread(2, targetClass);
        MyThread myThread3 = new MyThread(3, targetClass);

        myThread1.start();
        myThread2.start();
        myThread3.start();


    }

}
