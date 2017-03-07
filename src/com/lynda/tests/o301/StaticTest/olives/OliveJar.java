package com.lynda.tests.o301.StaticTest.olives;

import java.util.ArrayList;

public class OliveJar {

    public static ArrayList<Olive> olives;

    static {
        olives = new ArrayList<>();
        olives.add(new Olive(OliveName.KALAMATA, Olive.BLACK));
        olives.add(new Olive(OliveName.KALAMATA, Olive.BLACK));
        olives.add(new Olive(OliveName.KALAMATA, Olive.BLACK));
    }

}
