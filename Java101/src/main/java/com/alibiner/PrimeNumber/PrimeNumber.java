package com.alibiner.PrimeNumber;

public class PrimeNumber {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            int dividingValueCount = 0;
            for (int j = 1; j <=i ; j++) {
                if (i%j==0)
                    dividingValueCount++;
            }
            if (dividingValueCount==2)
                System.out.print(i + " ");
        }
    }
}
