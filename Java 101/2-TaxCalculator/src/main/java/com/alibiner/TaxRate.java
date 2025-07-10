package com.alibiner;

// This class defines the tax rate and its range
public class TaxRate {
    private float rate;       // Tax rate (example: 18)
    private float minRange;   // Minimum price for this rate
    private float maxRange;   // Maximum price for this rate

    public TaxRate(float rate, float minRange, float maxRange) {
        this.rate = rate;
        this.minRange = minRange;
        this.maxRange = maxRange;
    }

    public float getRate() {
        return rate;
    }

    public float getMinRange() {
        return minRange;
    }

    public float getMaxRange() {
        return maxRange;
    }
}
