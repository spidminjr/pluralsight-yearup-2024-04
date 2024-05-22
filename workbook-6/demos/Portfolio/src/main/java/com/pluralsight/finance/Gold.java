package com.pluralsight.finance;

import com.pluralsight.FixedAsset;

public class Gold extends FixedAsset

{
    private double weight;

    public Gold(String name, double value, double weight) {
        super(name, value);
        this.weight = weight;
    }

    @Override
    public double getValue()
    {
        System.out.println("Gold ");
        return 0;
    }
}
