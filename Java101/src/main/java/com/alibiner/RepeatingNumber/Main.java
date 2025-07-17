package com.alibiner.RepeatingNumber;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[100];

        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100)+1;
        }

        for (int value : array)
            System.out.print(value + " ");

        System.out.println();
        System.out.println("Tekrar Sayıları: ");
        for (int i = 0; i < array.length; i++) {
            int innerCounter = 0;
            for (int j = 0; j < array.length ; j++) {
                if (array[i]==array[j])
                    innerCounter++;
            }
            if (innerCounter>1) {
                System.out.println( array[i] + " Sayısı " + innerCounter + " kez tekrar edildi.");
                System.out.println("-------------------------------------------------------------------");
            }
        }
    }
}
