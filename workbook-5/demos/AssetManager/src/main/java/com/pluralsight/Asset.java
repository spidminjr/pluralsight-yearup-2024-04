package com.pluralsight;

public class Asset
{
    private String description;
    private String dateAcquired;
    private double originalCost;

    public Asset( double originalCOst, String dateAcquired, String description)
    {
        this.description = description;
        this.originalCost = originalCOst;
        this.dateAcquired = dateAcquired;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDateAcquired() {
        return dateAcquired;
    }

    public void setDateAcquired(String dateAcquired) {
        this.dateAcquired = dateAcquired;
    }

    public double getOriginalCOst() {
        return originalCost;
    }

    public void setOriginalCOst(double originalCOst) {
        this.originalCost = originalCOst;
    }

    public double getValue()
    {
        return originalCost;
    }
}
