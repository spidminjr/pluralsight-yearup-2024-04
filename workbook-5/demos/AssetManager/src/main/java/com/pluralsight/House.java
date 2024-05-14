package com.pluralsight;

public class House extends Asset
{
    private String address;
    private int condition;
    private int squareFoot;
    private int lotSize;

    public House(String description, String dateAcquired, double originalCost, String address, int condition, int squareFoot, int lotSize)
    {
        super(originalCost, description, dateAcquired);
        this.address = address;
        this.condition = condition;
        this.squareFoot = squareFoot;
        this.lotSize = lotSize;
    }


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCondition() {
        return condition;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }

    public int getSquareFoot() {
        return squareFoot;
    }

    public void setSquareFoot(int squareFoot) {
        this.squareFoot = squareFoot;
    }

    public int getLotSize() {
        return lotSize;
    }

    public void setLotSize(int lotSize) {
        this.lotSize = lotSize;
    }

    @Override
    public double getValue()
    {
        double valuePerSquareFoot;
        switch(condition)
        {
            case 1:
                valuePerSquareFoot = 180.00;
                break;
            case 2:
                valuePerSquareFoot = 130.00;
                break;
            case 3:
                valuePerSquareFoot = 90.00;
                break;
            case 4:
                valuePerSquareFoot = 80.00;
                break;
            default:
                valuePerSquareFoot = 0.00;
        }
        return valuePerSquareFoot * squareFoot + 0.25 * lotSize;
    }
}
