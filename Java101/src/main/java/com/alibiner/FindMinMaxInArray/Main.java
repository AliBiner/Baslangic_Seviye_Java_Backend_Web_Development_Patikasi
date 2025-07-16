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

        int controlValue = 50;

        int min = 0;
        for (int value : array) {
            if (value < controlValue){
                if (value>min)
                    min = value;
            }
        }
        String minResult = min == 0 ? controlValue + "'dan küçük değer bulunamadı." : "Min: " + min;
        System.out.println(minResult);

        int max = controlValue;
        for (int value : array){
            if (value>controlValue){
                if (value>max)
                    max = value;
            }
        }
        String maxResult = max == controlValue ? controlValue + "'dan büyük değer bulunamadı." : "Max: " + max;
        System.out.println(maxResult);

    }
}
