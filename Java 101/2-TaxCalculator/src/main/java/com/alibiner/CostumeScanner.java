package com.alibiner;

import java.util.InputMismatchException;
import java.util.Scanner;

// This class helps to get values from user using the console
public class CostumeScanner {
    private final Scanner scanner = new Scanner(System.in);

    // This method asks user to enter an integer value using a char label
    public int getIntValueOnConsole(char valueName, String text) {
        try {
            System.out.println(valueName + " " + text);
            return scanner.nextInt(); // read integer from user
        } catch (InputMismatchException e) {
            // if user enters a non-integer, show error and ask again
            System.out.println("Hatalı giriş! Lütfen tam sayı giriniz.");
            scanner.nextLine(); // clear the invalid input
            return getIntValueOnConsole(valueName, text); // recursive call
        }
    }

    // This method asks user to enter an integer value using a String label
    public int getIntValueOnConsole(String valueName, String text) {
        try {
            System.out.println(valueName + " " + text);
            return scanner.nextInt(); // read integer from user
        } catch (InputMismatchException e) {
            // if user enters a non-integer, show error and ask again
            System.out.println("Hatalı giriş! Lütfen tam sayı giriniz.");
            scanner.nextLine(); // clear the invalid input
            return getIntValueOnConsole(valueName, text); // recursive call
        }
    }

    // This method asks user to enter an integer value using a String label
    public int getIntValueOnConsole(String text) {
        try {
            System.out.println(text);
            return scanner.nextInt(); // read integer from user
        } catch (InputMismatchException e) {
            // if user enters a non-integer, show error and ask again
            System.out.println("Hatalı giriş! Lütfen tam sayı giriniz.");
            scanner.nextLine(); // clear the invalid input
            return getIntValueOnConsole(text); // recursive call
        }
    }

    // This method asks user to enter a decimal number (double) using a char label
    public double getDoubleValueOnConsole(char valueName, String text) {
        try {
            System.out.println(valueName + " " + text);
            return scanner.nextDouble(); // read double from user
        } catch (InputMismatchException e) {
            // if user enters a non-double, show error and ask again
            System.out.println("Hatalı giriş! Lütfen ondalıklı sayı giriniz.");
            scanner.nextLine(); // clear the invalid input
            return getDoubleValueOnConsole(valueName, text); // recursive call
        }
    }

    // This method asks user to enter a decimal number (double) using a char label
    public double getDoubleValueOnConsole(String valueName, String text) {
        try {
            System.out.println(valueName + " " + text);
            return scanner.nextDouble(); // read double from user
        } catch (InputMismatchException e) {
            // if user enters a non-double, show error and ask again
            System.out.println("Hatalı giriş! Lütfen ondalıklı sayı giriniz.");
            scanner.nextLine(); // clear the invalid input
            return getDoubleValueOnConsole(valueName, text); // recursive call
        }
    }

    // This method asks user to enter an integer value using a String label
    public float getFloatValueOnConsole(String text) {
        try {
            System.out.println(text);
            return scanner.nextFloat(); // read integer from user
        } catch (InputMismatchException e) {
            // if user enters a non-integer, show error and ask again
            System.out.println("Hatalı giriş! Lütfen tam sayı veya ondalıklı sayı giriniz.");
            scanner.nextLine(); // clear the invalid input
            return getFloatValueOnConsole(text); // recursive call
        }
    }
}

