package com.lynda.tests.o302.NonStaticTest.olives;

import com.lynda.tests.o301.StaticTest.olives.Olive;

import java.util.ArrayList;

public class OliveJarNonStatic {

    public ArrayList<Olive> olives;

    {
        olives = new ArrayList<>();
        olives.add(new Olive("Kalamata", Olive.BLACK));
        olives.add(new Olive("Kalamata", Olive.BLACK));
        olives.add(new Olive("Kalamata", Olive.BLACK));
    }

    public OliveJarNonStatic(int nOlive, String name, long color){
        for (int i = 1; i <= nOlive; i++) {
            olives.add(new Olive(name, color));
        }
    }


}
