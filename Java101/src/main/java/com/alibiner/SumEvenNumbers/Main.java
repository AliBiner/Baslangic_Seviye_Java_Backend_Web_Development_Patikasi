package com.alibiner.SumEvenNumbers;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long input;
        long sumEvenNumber = 0;
        do {
            System.out.print("Bir sayı giriniz: ");
            input = scanner.nextLong();
            if (input % 2 ==1)
                break;
            else if (input % 2==0 && input%4==0)
                sumEvenNumber += input;
        }while (!(input % 2 ==1));

        System.out.println(sumEvenNumber);
    }
}
