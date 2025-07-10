package com.alibiner.PowersOfNumber;

import java.util.Scanner;

public class PowersOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        long input = scanner.nextLong();

        for (int i = 1; i <= input; i*=4) {
            System.out.println("4'ün Katı : " + i);
        }
        for (int i = 1; i <= input; i*=5) {
            System.out.println("5'in Katı : "+ i);
        }
    }
}
