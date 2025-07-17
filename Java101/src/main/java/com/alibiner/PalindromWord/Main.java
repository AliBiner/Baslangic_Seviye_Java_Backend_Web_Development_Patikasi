package com.alibiner.PalindromWord;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir kelime yazınız.");
        String word = scanner.next();
        word = word.toLowerCase();
        System.out.println(isPalindrom(word) == true ? word + " Palindrom bir kelimedir." : word + " Palindrom bir kelime değildir." );
    }

    public static boolean isPalindrom(String word){
        int digitCount = word.length();

        int firstCharIndex = 0;
        int lastCharIndex = word.length()-1;
        boolean isPalindrom = false;
        while (firstCharIndex!=lastCharIndex && firstCharIndex<=lastCharIndex) {
            if (word.charAt(firstCharIndex)==word.charAt(lastCharIndex)){
                firstCharIndex++;
                lastCharIndex--;
                isPalindrom = true;
                continue;
            }
            else {
                isPalindrom = false;
                break;
            }
        }
        return isPalindrom;
    }
}
