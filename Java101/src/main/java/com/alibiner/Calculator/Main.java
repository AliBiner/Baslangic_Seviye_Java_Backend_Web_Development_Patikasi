package com.alibiner.Calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a,b,select;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Birinci sayıyı giriniz: ");
        a = scanner.nextInt();
        System.out.println();

        System.out.print("İkinci sayıyı giriniz: ");
        b = scanner.nextInt();
        System.out.println();

        System.out.println("Toplama işlemi için 1\nÇıkarma işlemi için 2\nÇarpma işlemi için 3\nBölme işlemi için 4'e basınız: ");
        select = scanner.nextInt();
        switch (select){
            case 1:
                System.out.println("Toplam: "+ (a+b));
                break;
            case 2:
                System.out.println("Çıkarma: " + (a-b));
                break;
            case 3:
                System.out.println("Çarpma: "+(a*b));
                break;
            case 4:
                System.out.println("Bölme: " + (a/b));
                break;
            default:
                break;
        }

    }
}
