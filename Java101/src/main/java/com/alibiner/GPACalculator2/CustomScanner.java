package com.alibiner.GPACalculator2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CustomScanner {
    private final Scanner scanner = new Scanner(System.in);

    public CustomScanner(String welcomeText) {
        System.out.println(welcomeText);
        System.out.println("----------------------------");
        System.out.println();
    }

    public CustomScanner() {
    }

    // This method asks user to enter an byte value using a String label. Value have to range
    public byte getPositiveByteAndRangeFromConsole(String text,byte minRange, byte maxRange) {
        try {
            System.out.println(text);
            byte input = scanner.nextByte(); // read integer from user
            if (input>=minRange && input<=maxRange){
                System.out.println("Hatalı Giriş! Lütfen " + minRange + "(dahil) - " + maxRange + "(dahil) arasında bir değer giriniz.");
                getPositiveByteAndRangeFromConsole(text,minRange,maxRange); // recursive call
            }
            return input;
        } catch (InputMismatchException e) {
            // if user enters a non-integer, show error and ask again
            System.out.println("Hatalı giriş! Lütfen tam sayı giriniz.");
            scanner.nextLine(); // clear the invalid input
            return getPositiveByteAndRangeFromConsole(text,minRange,maxRange); // recursive call
        }
        catch (NumberFormatException e) {
            // If the value is too big or not a number, show this message
            System.out.println("Hatalı Giriş! Lütfen " + Byte.MIN_VALUE + " - " + Byte.MAX_VALUE + "arasında bir değer giriniz." );
            // Check the next value
            return getPositiveByteAndRangeFromConsole(text,minRange,maxRange); // recursive call
        }
    }

    // This method asks user to enter an byte value using a String label. Value have to range
    public byte getByteFromConsole(String text) {
        try {
            System.out.println(text);
            return scanner.nextByte(); // read integer from user
        } catch (InputMismatchException e) {
            // if user enters a non-integer, show error and ask again
            System.out.println("Hatalı giriş! Lütfen tam sayı giriniz.");
            scanner.nextLine(); // clear the invalid input
            return getByteFromConsole(text); // recursive call
        }
        catch (NumberFormatException e) {
            // If the value is too big or not a number, show this message
            System.out.println("Hatalı Giriş! Lütfen " + Byte.MIN_VALUE + " - " + Byte.MAX_VALUE + "arasında bir değer giriniz." );
            // Check the next value
            return getByteFromConsole(text); // recursive call
        }
    }

    // This method asks user to enter an integer value using a char label
    public int getIntFromConsole(char valueName, String text) {
        try {
            System.out.println(valueName + " " + text);
            return scanner.nextInt(); // read integer from user
        } catch (InputMismatchException e) {
            // if user enters a non-integer, show error and ask again
            System.out.println("Hatalı giriş! Lütfen tam sayı giriniz.");
            scanner.nextLine(); // clear the invalid input
            return getIntFromConsole(valueName, text); // recursive call
        }
        catch (NumberFormatException e) {
            // If the value is too big or not a number, show this message
            System.out.println("Hatalı Giriş! Lütfen " + Integer.MIN_VALUE + " - " + Integer.MAX_VALUE + "arasında bir değer giriniz." );
            // Check the next value
            return getIntFromConsole(valueName, text); // recursive call
        }
    }

    // This method asks user to enter an integer value using a String label
    public int getIntFromConsole(String valueName, String text) {
        try {
            System.out.println(valueName + " " + text);
            return scanner.nextInt(); // read integer from user
        } catch (InputMismatchException e) {
            // if user enters a non-integer, show error and ask again
            System.out.println("Hatalı giriş! Lütfen tam sayı giriniz.");
            scanner.nextLine(); // clear the invalid input
            return getIntFromConsole(valueName, text); // recursive call
        }
        catch (NumberFormatException e) {
            // If the value is too big or not a number, show this message
            System.out.println("Hatalı Giriş! Lütfen " + Integer.MIN_VALUE + " - " + Integer.MAX_VALUE + "arasında bir değer giriniz." );
            // Check the next value
            return getIntFromConsole(valueName, text); // recursive call
        }
    }

    // This method asks user to enter an integer value using a String label
    public int getIntFromConsole(String text) {
        try {
            System.out.println(text);
            return scanner.nextInt(); // read integer from user
        } catch (InputMismatchException e) {
            // if user enters a non-integer, show error and ask again
            System.out.println("Hatalı giriş! Lütfen tam sayı giriniz.");
            scanner.nextLine(); // clear the invalid input
            return getIntFromConsole(text); // recursive call
        }
        catch (NumberFormatException e) {
            // If the value is too big or not a number, show this message
            System.out.println("Hatalı Giriş! Lütfen " + Integer.MIN_VALUE + " - " + Integer.MAX_VALUE + "arasında bir değer giriniz." );
            // Check the next value
            return getIntFromConsole(text); // recursive call
        }
    }

    // This method asks user to enter an integer value using a String label
    public int getPositiveIntAndRangeFromConsole(String text,int minRange, int maxRange) {
        try {
            System.out.println(text);
            int input = scanner.nextInt(); // read integer from user
            if (input>=minRange && input<=maxRange){
                System.out.println("Hatalı Giriş! Lütfen " + minRange + "(dahil) - " + maxRange + "(dahil) arasında bir değer giriniz.");
                getPositiveIntAndRangeFromConsole(text,minRange,maxRange); // recursive call
            }
            return input;
        } catch (InputMismatchException e) {
            // if user enters a non-integer, show error and ask again
            System.out.println("Hatalı giriş! Lütfen tam sayı giriniz.");
            scanner.nextLine(); // clear the invalid input
            return getPositiveIntAndRangeFromConsole(text,minRange,maxRange); // recursive call
        }
        catch (NumberFormatException e) {
            // If the value is too big or not a number, show this message
            System.out.println("Hatalı Giriş! Lütfen " + Integer.MIN_VALUE + " - " + Integer.MAX_VALUE + "arasında bir değer giriniz." );
            // Check the next value
            return getPositiveIntAndRangeFromConsole(text,minRange,maxRange); // recursive call
        }
    }

    // This method asks user to enter a decimal number (double) using a char label
    public double getDoubleFromConsole(char valueName, String text) {
        try {
            System.out.println(valueName + " " + text);
            return scanner.nextDouble(); // read double from user
        } catch (InputMismatchException e) {
            // if user enters a non-double, show error and ask again
            System.out.println("Hatalı giriş! Lütfen ondalıklı sayı giriniz.");
            scanner.nextLine(); // clear the invalid input
            return getDoubleFromConsole(valueName, text); // recursive call
        }
        catch (NumberFormatException e) {
            // If the value is too big or not a number, show this message
            System.out.println("Hatalı Giriş! Lütfen " + Double.MIN_VALUE + " - " + Double.MAX_VALUE + "arasında bir değer giriniz." );
            // Check the next value
            return getDoubleFromConsole(valueName, text); // recursive call
        }
    }

    // This method asks user to enter a decimal number (double) using a char label
    public double getDoubleFromConsole(String text) {
        try {
            System.out.println( text);
            return scanner.nextDouble(); // read double from user
        } catch (InputMismatchException e) {
            // if user enters a non-double, show error and ask again
            System.out.println("Hatalı giriş! Lütfen ondalıklı sayı giriniz.");
            scanner.nextLine(); // clear the invalid input
            return getDoubleFromConsole(text); // recursive call
        }
        catch (NumberFormatException e) {
            // If the value is too big or not a number, show this message
            System.out.println("Hatalı Giriş! Lütfen " + Double.MIN_VALUE + " - " + Double.MAX_VALUE + "arasında bir değer giriniz." );
            // Check the next value
            return getDoubleFromConsole(text); // recursive call
        }
    }

    // This method asks user to enter a decimal number (double) using a char label
    public double getPositiveDoubleFromConsole(String text) {
        try {
            System.out.println( text);
            double input = scanner.nextDouble(); // read double from user
            if(input<0){
                System.out.println("Hatalı Giriş! Lütfen pozitif değer giriniz.");
                getPositiveDoubleFromConsole(text);
            }
            return input;
        } catch (InputMismatchException e) {
            // if user enters a non-double, show error and ask again
            System.out.println("Hatalı giriş! Lütfen ondalıklı sayı giriniz.");
            scanner.nextLine(); // clear the invalid input
            return getPositiveDoubleFromConsole(text); // recursive call
        } catch (NumberFormatException e) {
            // If the value is too big or not a number, show this message
            System.out.println("Hatalı Giriş! Lütfen " + Double.MIN_VALUE + " - " + Double.MAX_VALUE + "arasında bir değer giriniz." );
            // Check the next value
            return getPositiveDoubleFromConsole(text);
        }
    }

    // This method asks user to enter a decimal number (double) using a char label
    public double getDoubleFromConsole(String valueName, String text) {
        try {
            System.out.println(valueName + " " + text);
            return scanner.nextDouble(); // read double from user
        } catch (InputMismatchException e) {
            // if user enters a non-double, show error and ask again
            System.out.println("Hatalı giriş! Lütfen ondalıklı sayı giriniz.");
            scanner.nextLine(); // clear the invalid input
            return getDoubleFromConsole(valueName, text); // recursive call
        }
        catch (NumberFormatException e) {
            // If the value is too big or not a number, show this message
            System.out.println("Hatalı Giriş! Lütfen " + Double.MIN_VALUE + " - " + Double.MAX_VALUE + "arasında bir değer giriniz." );
            // Check the next value
            return getDoubleFromConsole(valueName, text); // recursive call
        }
    }

    // This method asks user to enter an integer value using a String label
    public float getFloatFromConsole(String text) {
        try {
            System.out.println(text);
            return scanner.nextFloat(); // read integer from user
        } catch (InputMismatchException e) {
            // if user enters a non-integer, show error and ask again
            System.out.println("Hatalı giriş! Lütfen tam sayı veya ondalıklı sayı giriniz.");
            scanner.nextLine(); // clear the invalid input
            return getFloatFromConsole(text); // recursive call
        }
        catch (NumberFormatException e) {
            // If the value is too big or not a number, show this message
            System.out.println("Hatalı Giriş! Lütfen " + Float.MIN_VALUE + " - " + Float.MAX_VALUE + "arasında bir değer giriniz." );
            // Check the next value
            return getFloatFromConsole(text); // recursive call
        }
    }

    // This method asks user to enter an integer value using a String label
    public float getPositiveFloatFromConsole(String text) {
        try {
            System.out.println(text);
            float input = scanner.nextFloat();
            if (input<0){
                System.out.println("Hatalı Giriş! Lütfen pozitif değer giriniz.");
                getPositiveFloatFromConsole(text);
            }
            return input;// read integer from user
        } catch (InputMismatchException e) {
            // if user enters a non-integer, show error and ask again
            System.out.println("Hatalı giriş! Lütfen tam sayı veya ondalıklı sayı giriniz.");
            scanner.nextLine(); // clear the invalid input
            return getPositiveFloatFromConsole(text); // recursive call
        }
        catch (NumberFormatException e) {
            // If the value is too big or not a number, show this message
            System.out.println("Hatalı Giriş! Lütfen " + Float.MIN_VALUE + " - " + Float.MAX_VALUE + "arasında bir değer giriniz." );
            // Check the next value
            return getPositiveFloatFromConsole(text); // recursive call
        }
    }

    // This method asks user to enter an integer value using a String label
    public float getPositiveFloatFromConsoleOneLine(String text) {
        try {
            System.out.print(text);
            float input = scanner.nextFloat();
            if (input<0){
                System.out.println("Hatalı Giriş! Lütfen pozitif değer giriniz.");
                getPositiveFloatFromConsoleOneLine(text);
            }
            return input;// read integer from user
        } catch (InputMismatchException e) {
            // if user enters a non-integer, show error and ask again
            System.out.println("Hatalı giriş! Lütfen tam sayı veya ondalıklı sayı giriniz.");
            scanner.nextLine(); // clear the invalid input
            return getPositiveFloatFromConsoleOneLine(text); // recursive call
        }
        catch (NumberFormatException e) {
            // If the value is too big or not a number, show this message
            System.out.println("Hatalı Giriş! Lütfen " + Float.MIN_VALUE + " - " + Float.MAX_VALUE + "arasında bir değer giriniz." );
            // Check the next value
            return getPositiveFloatFromConsoleOneLine(text); // recursive call
        }
    }
}