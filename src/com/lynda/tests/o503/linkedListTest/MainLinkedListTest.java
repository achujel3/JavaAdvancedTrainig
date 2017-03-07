package com.lynda.tests.o503.linkedListTest;

import com.lynda.tests.o301.StaticTest.olives.Olive;
import com.lynda.tests.o403.testingInheritanceTrees.oliveKinds.Kalamata;
import com.lynda.tests.o403.testingInheritanceTrees.oliveKinds.Ligurio;
import com.lynda.tests.o403.testingInheritanceTrees.oliveKinds.Picholine;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public class MainLinkedListTest {

    public static void main(String[] args) {

        Olive ligurio = new Ligurio();
        Olive kalamata = new Kalamata();
        Olive picholine = new Picholine();

        LinkedList<Olive> olives = new LinkedList<>();
        olives.add(ligurio);
        olives.add(kalamata);
        olives.add(picholine);

        olives.addFirst(kalamata);
        olives.add(1, picholine);

        display(olives);

    }

    private static void display(Collection<Olive> olives) {
        Iterator<Olive> iterator = olives.iterator();
        while(iterator.hasNext()) {
            Olive olive = (Olive) iterator.next();
            System.out.println(olive.getName().toString());
        }
    }

}
