package com.lynda.tests.o604.testingCustomExceptions.utils;

import java.io.*;

public class MyFileReader {

    public static String readFile(String fileName) throws IOException {

        StringBuilder stringBuilder = new StringBuilder();
        try (
                FileReader fileReader = new FileReader(fileName);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
        ) {
            String s;
            while ((s = bufferedReader.readLine()) != null) {
                stringBuilder.append(s);
            }
        } catch (FileNotFoundException e) {
            System.out.println("MyFileReader: no such file.");
        }

        return stringBuilder.toString();
    }

}
