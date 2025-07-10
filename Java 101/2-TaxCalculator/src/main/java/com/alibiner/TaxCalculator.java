package com.alibiner;

import java.util.List;

// This class is responsible for calculating tax and running the program loop
public class TaxCalculator {

    // This method calculates the tax based on the given price and tax list
    private static TaxPrice calculate(List<TaxRate> taxRateList, float price) {
        float taxValue = 0.00f;
        float priceWithTax = 0.00f;
        float appliedRate = 0.00f;

        // Find the correct tax rate according to price
        for (TaxRate taxRate : taxRateList) {
            if (price >= taxRate.getMinRange() && price < taxRate.getMaxRange()) {
                taxValue = (taxRate.getRate() * price) / 100;
                priceWithTax = taxValue + price;
                appliedRate = taxRate.getRate();
                break; // We found the correct range, stop the loop
            }
        }
        return new TaxPrice(taxValue, priceWithTax, appliedRate);
    }

    // This method starts the program, gets input, shows result, and loops
    public static void start(List<TaxRate> taxRateList) {
        CostumeScanner costumeScanner = new CostumeScanner();
        float price = costumeScanner.getFloatValueOnConsole("Hesaplama işlemi için lütfen bir tutar giriniz: ");
        while (price < 0) {
            System.out.println("Negatif tutar girilemez. Lütfen pozitif bir tutar giriniz.");
            price = costumeScanner.getFloatValueOnConsole("Hesaplama işlemi için lütfen bir tutar giriniz: ");
        }
        TaxPrice taxPrice = calculate(taxRateList, price);
        System.out.println("KDV'siz Fiyat: " + price);
        System.out.println("KDV'li Fiyat : " + taxPrice.getPriceWithTax());
        System.out.println("KDV Miktarı  : " + taxPrice.getTaxValue());
        System.out.println("KDV Oranı    : " + taxPrice.getAppliedRate() + "%");
        System.out.println("-----------");

        int choice = costumeScanner.getIntValueOnConsole("Devam etmek için 1'e, çıkış yapmak için 2'ye basınız.");
        if (choice != 2)
            start(taxRateList); // Call again to restart
    }
}

