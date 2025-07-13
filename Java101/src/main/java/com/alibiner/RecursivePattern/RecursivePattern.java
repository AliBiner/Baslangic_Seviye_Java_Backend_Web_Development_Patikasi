package com.alibiner.RecursivePattern;

import java.util.Scanner;

public class RecursivePattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int number = scanner.nextInt();
        pattern(number,number,true);
    }

    public static void pattern(int number, int temp, boolean way){
        if (temp > 0 && way) {
            System.out.print(temp + " ");
            temp -= 5;
            pattern(number, temp, way);
        }
        else {
            if (number < temp)
                return;
            System.out.print(temp + " " );
            way = false;
            temp += 5;
            pattern(number, temp, way);
        }
    }
}
