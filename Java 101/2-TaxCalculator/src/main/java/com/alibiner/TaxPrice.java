package com.alibiner;

// This class holds the result of the tax calculation
public class TaxPrice {
    private float taxValue;       // Calculated tax value
    private float priceWithTax;   // Total price after tax
    private float appliedRate;    // Applied tax rate

    public TaxPrice(float taxValue, float priceWithTax, float appliedRate) {
        this.taxValue = taxValue;
        this.priceWithTax = priceWithTax;
        this.appliedRate = appliedRate;
    }

    public float getTaxValue() {
        return taxValue;
    }

    public float getPriceWithTax() {
        return priceWithTax;
    }

    public float getAppliedRate() {
        return appliedRate;
    }
}
