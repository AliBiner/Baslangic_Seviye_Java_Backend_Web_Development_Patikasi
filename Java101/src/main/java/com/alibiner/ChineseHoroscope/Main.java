package com.alibiner.ChineseHoroscope;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Doğum yılınızı giriniz: ");
        int birthYear = scanner.nextInt();
        byte mod = (byte) (birthYear % 12);
        String horoscope = "";
        switch (mod){
            case 0 :
                horoscope = "Maymun";
                break;
            case 1 :
                horoscope = "Horoz";
                break;
            case 2 :
                horoscope = "Köpek";
                break;
            case 3 :
                horoscope = "Domuz";
                break;
            case 4 :
                horoscope = "Fare";
                break;
            case 5 :
                horoscope = "Öküz";
                break;
            case 6 :
                horoscope = "Kaplan";
                break;
            case 7 :
                horoscope = "Tavşan";
                break;
            case 8 :
                horoscope = "Ejderha";
                break;
            case 9 :
                horoscope = "Yılan";
                break;
            case 10 :
                horoscope = "At";
                break;
            case 11:
                horoscope = "Koyun";
                break;
            default:
                break;

        }

        System.out.println(horoscope);

    }
}
