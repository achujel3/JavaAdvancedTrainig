package com.lynda.tests.o702.testingWorkWithFiles;

import com.lynda.tests.o604.testingCustomExceptions.utils.MyFileReader;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class MainTestWorkWithFiles {

    public static void main(String[] args) throws IOException {

        String sourceFileName = "src/com/lynda/tests/o702/testingWorkWithFiles/files/SomeFile.txt";
        String targetFileName = "src/com/lynda/tests/o702/testingWorkWithFiles/files/NewFile.txt";
        String newDirectory = "src/com/lynda/tests/o702/testingWorkWithFiles/newDirectory";
        Path source = Paths.get(sourceFileName);
        System.out.println(source.getFileName());
        System.out.println(source.getNameCount());
        System.out.println(MyFileReader.readFile(sourceFileName));

        try {
            Path target = Paths.get(targetFileName);
            Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);

            Path newDir = Paths.get(newDirectory);
            Files.createDirectories(newDir);

            Files.move(source, newDir.resolve(source.getFileName()), StandardCopyOption.REPLACE_EXISTING);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }

}

