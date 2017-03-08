package com.lynda.tests.o703.testingTextWritingToFile;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;

public class MainTestFileWritingToFile {

    public static void main(String[] args) {

        String sourceFilePath = "src/com/lynda/tests/o703/testingTextWritingToFile/files/ExampleFile.txt";
        String targetFilePath = "src/com/lynda/tests/o703/testingTextWritingToFile/files/TargetFile.txt";

        Path source = Paths.get(sourceFilePath);
        System.out.println(source.getFileName());

        Path target = Paths.get(targetFilePath);
        System.out.println(source.getFileName());

        Charset charset = Charset.forName("US-ASCII");
        ArrayList<String> lines = new ArrayList<>();

        try (BufferedReader bufferedReader = Files.newBufferedReader(source, charset)) {
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
                lines.add(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        try (BufferedWriter bufferedWriter = Files.newBufferedWriter(target, charset)){
            Iterator<String> iterator = lines.iterator();

            while(iterator.hasNext()) {
                String s = iterator.next();
                bufferedWriter.append(s, 0, s.length());
                bufferedWriter.newLine();
            }
        } catch(Exception e ){
            e.printStackTrace();
        }

    }

}
