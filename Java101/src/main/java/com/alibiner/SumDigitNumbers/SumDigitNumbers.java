package com.alibiner.SumDigitNumbers;

import java.util.Scanner;

public class SumDigitNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Sayı giriniz: ");
        long input = scanner.nextLong();
        long tempInput = input;

        byte digitsCount=0;

        while (tempInput % 10 != 0){
            tempInput /= 10;
            digitsCount++;
        }

        tempInput = input;

        int sumDigitNumbers=0;

        for (int i = 0; i < digitsCount; i++) {
            byte digitValue = (byte) (tempInput % 10);
            sumDigitNumbers += digitValue;
            tempInput /= 10;
        }

        System.out.println(sumDigitNumbers);
    }
}
