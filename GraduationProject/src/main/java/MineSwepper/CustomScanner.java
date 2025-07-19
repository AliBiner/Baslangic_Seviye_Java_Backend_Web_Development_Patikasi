package MineSwepper;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CustomScanner {
    Scanner scanner = new Scanner(System.in);

    // This method asks user to enter an integer value using a String label
    public int getAbsoluteRange(String text,int minRange, int maxRange) {
        if (minRange<0)
            minRange=1;

        if (maxRange<0)
            maxRange = Math.abs(maxRange);

        int input = -1;
        while (input == -1) {
            try {
                System.out.println(text);
                int tmp = scanner.nextInt(); // read integer from user
                if (tmp < minRange || tmp > maxRange) {
                    System.out.println("Hatalı Giriş! Lütfen " + minRange + "(dahil) - " + maxRange + "(dahil) arasında bir değer giriniz.");
                    scanner.nextLine(); // clear the invalid input
                }
                else {
                    return tmp;
                }
            } catch (InputMismatchException e) {
                // if user enters a non-integer, show error and ask again
                System.out.println("Hatalı giriş! Lütfen tam sayı giriniz.");
                scanner.nextLine(); // clear the invalid input
            } catch (NumberFormatException e) {
                // If the value is too big or not a number, show this message
                System.out.println("Hatalı Giriş! Lütfen " + Integer.MIN_VALUE + " - " + Integer.MAX_VALUE + "arasında bir değer giriniz.");
                scanner.nextLine(); // clear the invalid input
            }
        }
        return input;
    }

    // This method asks user to enter an integer value using a String label
    public int getAbsoluteRange(String text,int minRange) {
        if (minRange<0)
            minRange=1;

        int input = -1;
        while (input == -1){
            try {
                System.out.println(text);
                int tmp = scanner.nextInt(); // read integer from user
                if (tmp<minRange){
                    System.out.println("Hatalı Giriş! Lütfen " + minRange + "'den büyük bir değer giriniz.");
                    scanner.nextLine(); // clear the invalid input
                }
                else
                    return tmp;
            } catch (InputMismatchException e) {
                // if user enters a non-integer, show error and ask again
                System.out.println("Hatalı giriş! Lütfen tam sayı giriniz.");
                scanner.nextLine(); // clear the invalid input
            }
            catch (NumberFormatException e) {
                // If the value is too big or not a number, show this message
                System.out.println("Hatalı Giriş! Lütfen " + Integer.MIN_VALUE + " - " + Integer.MAX_VALUE + "arasında bir değer giriniz." );
                scanner.nextLine(); // clear the invalid input
            }
        }
        return input;
    }
}
