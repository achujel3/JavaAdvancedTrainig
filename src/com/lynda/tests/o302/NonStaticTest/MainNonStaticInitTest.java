package com.lynda.tests.o302.NonStaticTest;

import com.lynda.tests.o301.StaticTest.olives.Olive;
import com.lynda.tests.o302.NonStaticTest.olives.OliveJarNonStatic;

import java.util.ArrayList;

public class MainNonStaticInitTest {

    public static void main(String[] args) {

        ArrayList<Olive> olives = new OliveJarNonStatic(3, "Kalamata", Olive.BLACK).olives;

        for (Olive olive : olives) {
            System.out.println(olive.getId() + ". This is " + olive.getName() + " olive!");
        }

    }

}
