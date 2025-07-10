package com.alibiner.GPACalculator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class OnConsole {

    // This method asks user to enter an integer value using a char label
    public static int getIntValueOnConsole(char valueName, String text){
        int value;
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println(valueName + " " + text);
            value = scanner.nextInt(); // read integer from user
        } catch (InputMismatchException e) {
            // if user enters a non-integer, show error and ask again
            System.out.println("Hatalı giriş! Lütfen tam sayı giriniz.");
            value =getIntValueOnConsole(valueName,text); // recursive call
        }
        return value;
    }

    // This method asks user to enter an integer value using a String label
    public static int getIntValueOnConsole(String valueName, String text) {
        int value;
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println(valueName + " " + text);
            value = scanner.nextInt(); // read integer from user
        } catch (InputMismatchException e) {
            // if user enters a non-integer, show error and ask again
            System.out.println("Hatalı giriş! Lütfen tam sayı giriniz.");
            value =getIntValueOnConsole(valueName,text); // recursive call
        }
        return value;
    }

    // This method asks user to enter a decimal number (double) using a char label
    public static double getDoubleValueOnConsole(char valueName, String text){
        double value;
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println(valueName + " " + text);
            value = scanner.nextDouble(); // read double from user
        } catch (InputMismatchException e) {
            // if user enters a non-double, show error and ask again
            System.out.println("Hatalı giriş! Lütfen ondalıklı sayı giriniz.");
            value =getDoubleValueOnConsole(valueName,text); // recursive call
        }
        return value;
    }
    // This method asks user to enter a decimal number (double) using a char label
    public static double getDoubleValueOnConsole(String valueName, String text){
        double value;
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println(valueName + " " + text);
            value = scanner.nextDouble(); // read double from user
        } catch (InputMismatchException e) {
            // if user enters a non-double, show error and ask again
            System.out.println("Hatalı giriş! Lütfen ondalıklı sayı giriniz.");
            value =getDoubleValueOnConsole(valueName,text); // recursive call
        }
        return value;
    }
}
