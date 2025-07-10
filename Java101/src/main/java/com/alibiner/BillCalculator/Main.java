package com.alibiner.BillCalculator;

import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;

public class Main {
    public static void main(String[] args) {
        CustomScanner scanner = new CustomScanner();

        //Initial a dictionary for prices
        Dictionary<String, Float> productPrices = new Hashtable<>();
        productPrices.put("Armut", 2.14f);
        productPrices.put("Elma", 3.67f);
        productPrices.put("Domates", 1.11f);
        productPrices.put("Muz", 0.95f);
        productPrices.put("Patlıcan", 5.00f);

        //Initial a dictionary for orders
        Dictionary<String, Float> orders = new Hashtable<>();
        orders.put("Armut", scanner.getPositiveFloatFromConsoleOneLine("Armut Kaç Kilo ? : "));
        orders.put("Elma", scanner.getPositiveFloatFromConsoleOneLine("Elma Kaç Kilo ? : "));
        orders.put("Domates", scanner.getPositiveFloatFromConsoleOneLine("Domates Kaç Kilo ? : "));
        orders.put("Muz", scanner.getPositiveFloatFromConsoleOneLine("Muz Kaç Kilo ? : "));
        orders.put("Patlıcan", scanner.getPositiveFloatFromConsoleOneLine("Patlıcan Kaç Kilo ? : "));

        //Total bill price
        float bill = 0.00f;

        //Search to find product prices that the match the order
        Enumeration<String> keys = orders.keys();
        while (keys.hasMoreElements()) {
            String orderKey = keys.nextElement();
            //find product price and (order weight * product price) + current bill
            bill = bill + (productPrices.get(orderKey) * orders.get(orderKey));
        }

        System.out.println("Toplam Tutar : " + bill + "TL");
    }
}
