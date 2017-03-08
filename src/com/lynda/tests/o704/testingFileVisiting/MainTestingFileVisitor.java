package com.lynda.tests.o704.testingFileVisiting;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class MainTestingFileVisitor {

    public static void main(String[] args) throws IOException {

        Path fileDirectory = Paths.get("src/com/lynda/tests");
        MyFileVisitor myFileVisitor = new MyFileVisitor();
        Files.walkFileTree(fileDirectory, myFileVisitor);

    }

}
