package com.pluralsight;

public class CellPhone
{
    private int serialNumber;
    private String model;
    private String carrier;
    private int phoneNumber;
    private String owner;


    public CellPhone()
    {
        this.serialNumber = 0;
        this.model = "";
        this.carrier = "";
        this.phoneNumber = 0;
        this.owner = "";
    }

    // getter and setter
    public int getSerialNumber()
    {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber)
    {
        this.serialNumber = serialNumber;
    }

    public String getModel()
    {
        return model;
    }

    public void setModel(String model)
    {
        this.model = model;
    }

    public String getCarrier()
    {
        return carrier;
    }

    public void setCarrier(String carrier)
    {
        this.carrier = carrier;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }

    public String getOwner()
    {
        return owner;
    }

    public void SetOwner(String owner)
    {
        this.owner = owner;
    }
}