package com.alibiner.FlightTicket;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        float pricePerKM = 0.10f;
        CustomScanner scanner = new CustomScanner("Uçak bileti uygulamasına hoşgeldiniz");
        int distance = scanner.getPositiveIntFromConsole("Uçuş mesafesi giriniz: ");
        byte age = scanner.getPositiveByteFromConsole("Yaşınızı giriniz: ");
        byte flightType = scanner.getPositiveByteAndRangeFromConsole("Yolculuk tipini giriniz (1 => Tek yön, 2 => Gidiş Dönüş): ",(byte) 1,(byte) 2);

        float totalPrice = pricePerKM * distance;
        float discountAge = 0.00f;
        if (age<12)
            discountAge = totalPrice * 0.50f;
        else if (age>=12 && age<=24) {
            discountAge = totalPrice * 0.10f;
        } else if (age>=65) {
            discountAge = totalPrice * 0.30f;
        }
        float reducedPrice = totalPrice - discountAge;

        if (flightType ==1)
            System.out.println("Toplam Tutar = " + reducedPrice + " TL");
        else{
            float discountFlightType = reducedPrice * 0.20f;
            reducedPrice -=discountFlightType;
            System.out.println("Toplam Tutar = " + reducedPrice*2 + " TL");
        }





    }
}
