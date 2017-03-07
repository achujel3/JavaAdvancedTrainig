package com.lynda.tests.o401.classTest;

import com.lynda.tests.o301.StaticTest.olives.Olive;
import com.lynda.tests.o301.StaticTest.olives.OliveColor;
import com.lynda.tests.o301.StaticTest.olives.OliveName;

import java.lang.reflect.Constructor;

public class MainTestingClass {

    public static void main(String[] args) {

        Olive olive = new Olive(OliveName.KALAMATA, OliveColor.GREEN);

        Class<?> clazz = olive.getClass();
        System.out.println(clazz);
        System.out.println(clazz.getName());
        System.out.println(clazz.getSimpleName());

        Constructor<?>[] constructors = clazz.getConstructors();
        System.out.println("Number of constructors: " + constructors.length);
        Constructor<?> constructor = constructors[0];

        Object object = null;

        try {
            object = constructor.newInstance(OliveName.KALAMATA, OliveColor.GREEN);
            System.out.println(object);
        } catch (Exception e ) {
            e.printStackTrace();
        }

    }

}
