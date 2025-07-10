package com.alibiner.ExponentCalculator;

import java.util.Scanner;

public class ExponentCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Üssü alınacak sayı giriniz: ");
        int n = scanner.nextInt();

        System.out.print("Üs olacak sayı: ");
        int k = scanner.nextInt();

        long result = 1;

        for (int i = 0; i < k; i++)
            result = result * n;

        System.out.println(result);
    }
}
