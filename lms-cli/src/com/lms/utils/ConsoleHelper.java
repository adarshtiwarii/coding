package com.lms.utils;

import java.util.Scanner;

public class ConsoleHelper {
    // Correctly define a static method that takes Scanner and a message
    public static String prompt(Scanner sc, String message) {
        System.out.print(message);
        return sc.nextLine();
    }
}
