package com.lynda.tests.o502.treeSetTest;

import com.lynda.tests.o301.StaticTest.olives.Olive;
import com.lynda.tests.o403.testingInheritanceTrees.oliveKinds.Kalamata;
import com.lynda.tests.o403.testingInheritanceTrees.oliveKinds.Ligurio;
import com.lynda.tests.o403.testingInheritanceTrees.oliveKinds.Picholine;

import java.util.TreeSet;

public class MainTreeSetTest {

    public static void main(String[] args) {


        Olive ligurio = new Ligurio();
        Olive kalamata = new Kalamata();
        Olive picholine = new Picholine();

        TreeSet<Olive> olives = new TreeSet<>();
        try {
            olives.add(ligurio);
            olives.add(kalamata);
            olives.add(picholine);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println(olives);

    }

}
