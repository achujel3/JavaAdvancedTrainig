package com.lynda.tests.o604.testingCustomExceptions.exceptions;

public class WrongFileException extends Exception {

    @Override
    public String getMessage() {
        return "You chose the wrong file.";
    }
}
