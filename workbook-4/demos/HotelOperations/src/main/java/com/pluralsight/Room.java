package com.pluralsight;

public class Room
{
    private int numberOfBeds;
    private double roomPrice;
    private String isOccupied;
    private String isDirty;
    private String isAvailable;

    public Room(int numberOfBeds, double roomPrice, String isOccupied, String isDirty, String isAvailable) {
        this.numberOfBeds = numberOfBeds;
        this.roomPrice = roomPrice;
        this.isOccupied = isOccupied;
        this.isDirty = isDirty;
        this.isAvailable = isAvailable;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    public double getRoomPrice() {
        return roomPrice;
    }

    public void setRoomPrice(double roomPrice) {
        this.roomPrice = roomPrice;
    }

    public String getIsOccupied() {
        return isOccupied;
    }

    public void setIsOccupied(String isOccupied) {
        this.isOccupied = isOccupied;
    }

    public String getIsDirty() {
        return isDirty;
    }

    public void setIsDirty(String isDirty) {
        this.isDirty = isDirty;
    }

    public String getIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(String isAvailable) {
        this.isAvailable = isAvailable;
    }

    public boolean isAvailable()
    {
        return !(isDirty && !isOccupied);
    }
}


