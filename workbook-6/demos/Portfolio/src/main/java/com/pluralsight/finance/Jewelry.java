package com.pluralsight.finance;

import com.pluralsight.FixedAsset;

public class Jewelry extends FixedAsset
{
    private double karat;


    public Jewelry(String name, double value, double karat) {
        super(name, value);
        this.karat = karat;
    }

    public double getKarat() {
        return karat;
    }

    public void setKarat(double karat) {
        this.karat = karat;
    }

    @Override
    public double getValue()
    {
        System.out.println("Jewelry");
        return 0;
    }
}
