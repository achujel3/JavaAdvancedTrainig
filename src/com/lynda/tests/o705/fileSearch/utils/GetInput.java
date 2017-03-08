package com.lynda.tests.o705.fileSearch.utils;

import java.io.IOException;
import java.util.Scanner;

public class GetInput {

    public static String getInput(String prompt) {
        System.out.println(prompt);
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

    public static String pressEnterAndClearScreen() throws IOException {
        System.out.println("Press enter to finish.");
        Scanner scanner = new Scanner(System.in);
        Runtime.getRuntime().exec("clear");
        return scanner.nextLine();
    }


}
