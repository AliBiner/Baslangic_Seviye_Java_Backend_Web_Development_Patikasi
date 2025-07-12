package com.alibiner.FibonacciNumbers;

import java.util.Scanner;

public class FibonacciNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Fibonacci seri sayısı giriniz: ");
        int input = scanner.nextInt();

        int firstFibonacci = 0;
        int secondFibonacci = 1;
        for (int i = 0; i <= input; i++) {
            if (i == 0)
                System.out.print(firstFibonacci + " ");
            else if (i==1) {
                System.out.print(secondFibonacci + " ");
            }else {
                int temp = secondFibonacci;
                secondFibonacci += firstFibonacci;
                System.out.print(secondFibonacci + " ");
                firstFibonacci=temp;

            }

        }
    }
}

// 0 1 1