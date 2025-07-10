package com.alibiner.AverageCalculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Pozitif bir tam sayı giriniz: ");
        int input = scanner.nextInt();

        long sum=0;
        long count=0;
        for (int i = 1; i <= input; i++) {
            if (i%3==0 && i%4==0){
                sum = sum + i;
                count++;
                System.out.println(i);
            }
        }
        long avarage = sum / count;
        System.out.println("3 ve 4'e tam bölünen sayıların ortalaması = "+avarage);

    }
}
