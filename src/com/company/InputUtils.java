package com.company;

import java.util.Scanner;

public class InputUtils {
    private static final Scanner scanner = new Scanner(System.in);

    public static String askString(String message) {
        System.out.println("askString() started");

        System.out.print(message + ": ");
        return scanner.next();
    }

    public static int askInt(String message) {
        System.out.println(message + ": ");
        return scanner.nextInt();
    }
}
