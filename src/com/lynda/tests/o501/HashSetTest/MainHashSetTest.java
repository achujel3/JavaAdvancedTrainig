package com.lynda.tests.o501.HashSetTest;

import com.lynda.tests.o301.StaticTest.olives.Olive;
import com.lynda.tests.o403.testingInheritanceTrees.oliveKinds.Kalamata;
import com.lynda.tests.o403.testingInheritanceTrees.oliveKinds.Ligurio;
import com.lynda.tests.o403.testingInheritanceTrees.oliveKinds.Picholine;

import java.util.HashSet;

public class MainHashSetTest {

    public static void main(String[] args) {

        Olive ligurio = new Ligurio();
        Olive kalamata = new Kalamata();
        Olive picholine = new Picholine();

        HashSet<Olive> olives = new HashSet<>();
        olives.add(ligurio);
        olives.add(kalamata);
        System.out.println("There are " + olives.size() + " olives in the set.");

        olives.add(picholine);
        System.out.println("There are " + olives.size() + " olives in the set.");

        olives.add(ligurio);
        System.out.println("There are " + olives.size() + " olives in the set.");

        olives.add(null);
        System.out.println("There are " + olives.size() + " olives in the set.");

        olives.remove(ligurio);
        System.out.println("There are " + olives.size() + " olives in the set.");

        System.out.println(olives);

    }

}
