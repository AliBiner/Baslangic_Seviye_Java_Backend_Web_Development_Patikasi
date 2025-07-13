package com.alibiner.PrimeNumberWithRecursive;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int number = scanner.nextInt();
        System.out.println(isPrimeNumber(number,0,number) == true ? number + " sayısı ASALDIR !" : number + " sayısı ASAL değildir !");
    }

    public static boolean isPrimeNumber(int number, int count,int temp){
        if (number%temp==0)
            count++;
        if (count>2)
            return false;
        else if (temp==1 && count == 2)
            return true;
        else {
            return isPrimeNumber(number,count,--temp);
        }
    }
}
