package com.alibiner.FindMinMaxInArray;

public class Main {

    public static void main(String[] args) {
        int randomRange = (int) (Math.random() * 10);

        int[] array = new int[randomRange];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }

        System.out.print("Array: ");
        for(int value : array){
            System.out.print(value + " ");
        }
        System.out.println();

        int min = array[0];
        for (int value : array) {
            if (value<min)
                min = value;
        }

        System.out.println("Min: " + min);

        int max = array[0];
        for (int value : array){
            if (value>max)
                max = value;
        }
        System.out.println("Max: " + max);

    }
}
