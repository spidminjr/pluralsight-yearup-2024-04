package com.pluralsight;

import com.pluralsight.finance.Valuable;

public abstract class FixedAsset implements Valuable
{
    private String name;
    private double value;

    public FixedAsset(String name, double value)
    {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setValue(double value) {
        this.value = value;
    }

    @Override
    public double getValue()
    {
        System.out.println("value");
        return 0;
    }
}
