package com.lynda.tests.o601.assertTest;

import java.math.BigDecimal;
import java.util.Scanner;

public class MainAssertTest {

    public static void main(String[] args) {

        String s1 = getInput("Write first number: ");
        assert isString(s1);
        String s2 = getInput("Write second number: ");
        assert isString(s2);
        String action = getInput("Write your action: ");
        StringBuilder stringBuilder = new StringBuilder("The answer is: ");
        BigDecimal bigDecimal1 = new BigDecimal(s1);

        switch (action) {
            case "+":
                BigDecimal sum = bigDecimal1.add(new BigDecimal(s2));
                stringBuilder.append(sum);
                break;
            case "-":
                stringBuilder.append(Double.valueOf(s1) - Double.valueOf(s2));
                break;
            case "*":
                stringBuilder.append(Double.valueOf(s1) * Double.valueOf(s2));
                break;
            case "/":
                stringBuilder.append(Double.valueOf(s1) / Double.valueOf(s2));
                break;
            default:
                System.out.println("You've typed wrong action.");
                break;
        }

        System.out.println(stringBuilder);


    }


    private static String getInput(String prompt) {
        System.out.println(prompt);
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

    private static boolean isString(String s) {
        try {
            Integer.getInteger(s);
            return false;
        } catch (Exception e) {
            return true;
        }
    }
}
