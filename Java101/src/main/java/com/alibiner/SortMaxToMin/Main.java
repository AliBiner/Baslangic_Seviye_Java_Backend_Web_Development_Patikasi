package com.alibiner.SortMaxToMin;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[3];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter " + (i+1) + ". number: ");
            numbers[i] = scanner.nextInt();
        }

        for (int i = numbers.length-1; i >=0; i--) {
            for (int j = i-1; j >=0 ; j--) {
                if (numbers[j] < numbers[i]){
                    int temp = numbers[j];
                    numbers[j] = numbers[i];
                    numbers[i] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(numbers));
    }
}
