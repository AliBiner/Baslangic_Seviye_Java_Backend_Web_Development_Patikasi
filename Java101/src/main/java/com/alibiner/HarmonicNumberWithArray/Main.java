package com.alibiner.HarmonicNumberWithArray;

public class Main {
    public static void main(String[] args) {
        int randomLength = (int) (Math.random()* 10);
        int [] array = new int[randomLength];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }

        for (int k : array) {
            System.out.print(k + " ");
        }
        System.out.println();



        float[] harmonicArray = new float[array.length];
        for (int i = 0; i < array.length; i++) {
            float harmonic = 0.00f;
            for (int j = 1; j <= array[i]; j++) {
                harmonic += 1 / (float) j ;
            }
            harmonicArray[i] = harmonic;
        }


        for (float v : harmonicArray) {
            String formated = String.format("%.2f",v);
            System.out.print(formated + " ");
        }
        System.out.println();
    }
}
