package com.lynda.tests.o401.classTest;

import com.lynda.tests.o301.StaticTest.olives.Olive;
import com.lynda.tests.o301.StaticTest.olives.OliveName;

public class TestingClass {

    public static void main(String[] args) {

        Olive olive = new Olive(OliveName.KALAMATA, 0x00FF00);

        Class<?> clazz = olive.getClass();
        System.out.println(clazz);
        System.out.println(clazz.getName());
        System.out.println(clazz.getSimpleName());

    }

}
