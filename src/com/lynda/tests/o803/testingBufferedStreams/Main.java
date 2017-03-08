package com.lynda.tests.o803.testingBufferedStreams;

import java.io.*;

public class Main {

    public static void main(String[] args) {

        String source = "src/com/lynda/tests/o803/testingBufferedStreams/files/SimpleTextFile.txt";
        String target = "src/com/lynda/tests/o803/testingBufferedStreams/files/output.txt";

        try (BufferedReader fileInputStream = new BufferedReader(new FileReader(source));
             BufferedWriter fileOutputStream = new BufferedWriter(new FileWriter(target))
             ) {
            int c;
            while((c = fileInputStream.read()) != -1) {
                fileOutputStream.write(c);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
