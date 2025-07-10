package com.alibiner.FindHoroscope;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Doğum gününüzü giriniz: ");
        byte birthDay = scanner.nextByte();
        System.out.print("Doğum ayınızı giriniz: ");
        byte birthMonth = scanner.nextByte();


        if (birthMonth==1) {
            if (birthDay<=21)
                System.out.println("Oğlak Burcu");
            else
                System.out.println("Kova Burcu");
        } else if (birthMonth==2) {
            if (birthDay<=19)
                System.out.println("Kova Burcu");
            else
                System.out.println("Balık Burcu");
        } else if (birthMonth==3) {
            if (birthDay<=20)
                System.out.println("Balık Burcu");
            else
                System.out.println("Koç Burcu");
        } else if (birthMonth==4) {
            if (birthDay<=20)
                System.out.println("Koç Burcu");
            else
                System.out.println("Boğa Burcu");
        } else if (birthMonth==5) {
            if (birthDay<=21)
                System.out.println("Boğa Burcu");
            else
                System.out.println("İkizler Burcu");
        } else if (birthMonth==6) {
            if (birthDay<=22)
                System.out.println("İkizler Burcu");
            else
                System.out.println("Yengeç Burcu");
        } else if (birthMonth==7) {
            if (birthDay<=22)
                System.out.println("Yengeç Burcu");
            else
                System.out.println("Aslan Burcu");
        } else if (birthMonth==8) {
            if (birthDay<=22)
                System.out.println("Aslan Burcu");
            else
                System.out.println("Başak Burcu");
        } else if (birthMonth==9) {
            if (birthDay<=22)
                System.out.println("Başak Burcu");
            else
                System.out.println("Terazi Burcu");
        } else if (birthMonth==10) {
            if (birthDay<=22)
                System.out.println("Terazi Burcu");
            else
                System.out.println("Akrep Burcu");
        } else if (birthMonth==11) {
            if (birthDay<=21)
                System.out.println("Akrep Burcu");
            else
                System.out.println("Yay Burcu");
        } else if (birthMonth==12) {
            if (birthDay<=21)
                System.out.println("Yay Burcu");
            else
                System.out.println("Oğlak Burcu");
        }

    }
}
