package com.alibiner.EbobEkok;

import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Birinci sayıyı giriniz: ");
        int number1= scanner.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        int number2 = scanner.nextInt();

        int ebob = 0;
        int dividingValue = 1;
        while (dividingValue<=number1 ||  dividingValue <= number2){
            if (number1%dividingValue == number2%dividingValue)
                ebob=dividingValue;
            dividingValue++;
        }
        System.out.println( number1 + " ve " + number2 + "'nin ebobu: " + ebob);
        System.out.println( number1 + " ve " + number2 + "'nin ekoku: " + ((number1*number2)/ebob));
    }
}
