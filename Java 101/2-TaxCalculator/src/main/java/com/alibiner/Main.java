package com.alibiner;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<TaxRate> taxRateList = createTaxRateList();
        TaxCalculator.start(taxRateList); // Start the tax calculation process
    }

    // This method creates and returns the list of tax rates
    public static List<TaxRate> createTaxRateList(){
        List<TaxRate> taxRateList = new ArrayList<>();
        taxRateList.add(new TaxRate(18,0,1000));
        taxRateList.add(new TaxRate(8,1000,Float.MAX_VALUE));
        return taxRateList;
    }
}
