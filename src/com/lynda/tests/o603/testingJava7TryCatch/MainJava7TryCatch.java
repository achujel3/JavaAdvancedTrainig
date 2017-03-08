package com.lynda.tests.o603.testingJava7TryCatch;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MainJava7TryCatch {

    public static void main(String[] args) {

        try (
                FileReader fileReader = new FileReader("src/com/lynda/tests/o602/testingFinallyBlock/file/SomeText.txt");
                BufferedReader bufferedReader = new BufferedReader(fileReader);
        ) {
            String s;
            while ((s = bufferedReader.readLine()) != null) {
                System.out.println(s);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Still alive");
    }

}
