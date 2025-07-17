package com.alibiner.SortArrayMinToMax;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100)+1;
        }

        System.out.println("Array: " + Arrays.toString(numbers));

        for (int i = numbers.length-1; i >=0; i--) {
            for (int j = i-1; j >=0 ; j--) {
                if (numbers[j] > numbers[i]){
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }

        System.out.println("Sorted Array: " + Arrays.toString(numbers));
    }
}
