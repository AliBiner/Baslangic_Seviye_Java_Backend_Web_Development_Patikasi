package com.alibiner.FibonacciNumbersWithRecursive;

public class FibonacciNumber {
    public static int firstFinonacci = 0;
    public static int secondFibonacci = 1;

    public static void main(String[] args) {
        fibonacci(11);
    }

    public static void fibonacci(int length){
        if (length<0)
            return;
        System.out.print(firstFinonacci + " ");
        int temp = firstFinonacci;
        firstFinonacci += secondFibonacci;
        secondFibonacci = temp;
        fibonacci(length-1);
    }

}
