package com.pluralsight;

public class Main
{
    public static void main(String[] args)
    {
        HoverCraft hover = new HoverCraft("Red", 10, 4, 100);
        semiTruck truck = new semiTruck("Black", 2, 400, 200);
        Car car = new Car("Indigo", 4, 30, 100 );
        Moped slowRide = new Moped("Yellow",2,0,45);

        System.out.println(hover.getCargoCapacity());
    }
}