package com.lynda.tests.o804.testingToken;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String source = "src/com/lynda/tests/o803/testingBufferedStreams/files/SimpleTextFile.txt";
        String target = "src/com/lynda/tests/o803/testingBufferedStreams/files/output.txt";

        try (Scanner s = new Scanner(new BufferedReader(new FileReader(source)))) {
            s.useDelimiter(",");
            while (s.hasNext()) {
                System.out.println(s.next());
            }
            System.out.println("All done!");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
