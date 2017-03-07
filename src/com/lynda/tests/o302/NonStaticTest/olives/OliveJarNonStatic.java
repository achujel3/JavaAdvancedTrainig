package com.lynda.tests.o302.NonStaticTest.olives;

import com.lynda.tests.o301.StaticTest.olives.Olive;
import com.lynda.tests.o301.StaticTest.olives.OliveColor;
import com.lynda.tests.o301.StaticTest.olives.OliveName;

import java.util.ArrayList;

public class OliveJarNonStatic {

    public ArrayList<Olive> olives;

    {
        olives = new ArrayList<>();
        olives.add(new Olive(OliveName.KALAMATA, OliveColor.BLACK));
        olives.add(new Olive(OliveName.KALAMATA, OliveColor.BLACK));
        olives.add(new Olive(OliveName.KALAMATA, OliveColor.BLACK));
    }

    public OliveJarNonStatic(int nOlive, OliveName name, OliveColor color){
        for (int i = 1; i <= nOlive; i++) {
            olives.add(new Olive(name, color));
        }
    }


}
