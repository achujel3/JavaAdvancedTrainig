package com.lynda.tests.o604.testingCustomExceptions;

import com.lynda.tests.o604.testingCustomExceptions.exceptions.WrongFileException;
import com.lynda.tests.o604.testingCustomExceptions.utils.MyFileReader;

import java.io.IOException;

public class MainCustomExceptions {

    public static void main(String[] args) throws IOException {
//        String fileContent = MyFileReader.readFile("src/com/lynda/tests/o604/testingCustomExceptions/files/GoodFile.txt");
       String fileContent = MyFileReader.readFile("src/com/lynda/tests/o604/testingCustomExceptions/files/WrongFile.txt");

        try {
            if (fileContent.contains("good file")) {
                System.out.println("You chose good file.");
            } else {
                throw (new WrongFileException());
            }
        } catch (WrongFileException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Still alive");
    }

}
