package com.lynda.tests.o801.testingWorkWithByteStreams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainTestByteStream {

    public static void main(String[] args) {

        try (FileInputStream fileInputStream = new FileInputStream("src/com/lynda/tests/o801/testingWorkWithByteStreams/files/SimpleTextFile.txt");
             FileOutputStream fileOutputStream = new FileOutputStream("src/com/lynda/tests/o801/testingWorkWithByteStreams/files/output.txt")) {
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
