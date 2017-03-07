package com.lynda.tests.o301.StaticTest;

import com.lynda.tests.o301.StaticTest.olives.Olive;
import com.lynda.tests.o301.StaticTest.olives.OliveJar;

import java.util.ArrayList;

public class MainStaticInitTest {

    public static void main(String[] args) {

        ArrayList<Olive> olives = OliveJar.olives;
        for (Olive olive : olives) {
            System.out.println(olive.getName());
        }

    }

}
