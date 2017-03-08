package com.lynda.tests.o705.fileSearch.utils;

import java.io.BufferedReader;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class TextFinder {

    public static boolean isTextInPath(Path path, String textToFind) {

        Charset charset = Charset.forName("US-ASCII");
        ArrayList<String> lines = new ArrayList<>();
        boolean wasFound = false;
        int wasFoundCounter = 1;

        StringBuilder stringBuilder = new StringBuilder();

        try (BufferedReader bufferedReader = Files.newBufferedReader(path, charset)) {
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                if(line.contains(textToFind)){
                    stringBuilder.append(wasFoundCounter)
                            .append(". ")
                            .append(line);
                    System.out.println(stringBuilder);
                    wasFound = true;
                    wasFoundCounter++;
                    stringBuilder.setLength(0);
                }

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("");
        return wasFound;
    }

}
