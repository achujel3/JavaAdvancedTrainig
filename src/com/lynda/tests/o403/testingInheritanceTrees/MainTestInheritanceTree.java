package com.lynda.tests.o403.testingInheritanceTrees;

import com.lynda.tests.o403.testingInheritanceTrees.oliveKinds.Ligurio;

public class MainTestInheritanceTree {

    public static void main(String[] args) {

        Object object = new Ligurio();

        Class<?> clazz = object.getClass();
        System.out.println("The name of the class: " + clazz.getName());

        Class<?> superClass = clazz.getSuperclass();
        System.out.println("The name of the superclass: " + superClass.getName());

        Class<?> topClass = superClass.getSuperclass();
        System.out.println("The name of the top class: " + topClass.getName());

        Package pack = clazz.getPackage();
        System.out.println("The package is: " + pack);



    }

}
