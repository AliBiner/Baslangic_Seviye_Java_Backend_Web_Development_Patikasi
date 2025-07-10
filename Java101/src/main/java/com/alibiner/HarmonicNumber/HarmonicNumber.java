package com.alibiner.HarmonicNumber;

import java.util.Scanner;

public class HarmonicNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Sayı giriniz: ");
        long input = scanner.nextLong();

        float result = 0;
        for (float i = 1; i <= input ; i++)
            result += (float) 1/i;

        System.out.println(result);
    }
}
