package com.pluralsight;

public class Main {
    public static void main(String[] args)
    {
        roomTests();
        reservationTests();
    }

    public static void roomTests()
    {
        System.out.println();
        System.out.println("Room Tests");
        System.out.println("-----------------------------");

        Room room = new Room(2,124.00, false , false);
        System.out.println("Unoccupied clean room should be avaiable.");
        System.out.println("Is available: " + room.isAvailable());
        System.out.println();

        room.setOccupied(true);
        System.out.println("Occupied clean room should NOT be available.");
        System.out.println("Is available: " + room.isAvailable());
        System.out.println();

        room.setOccupied(false);
        room.setDirty(true);
        System.out.println("Dirty room should NOT be available.");
        System.out.println("Is available: " + room.isAvailable());
        System.out.println();
    }

    public static void reservationTests()
    {
        System.out.println();
        System.out.println("Reservation Tests");
        System.out.println("-----------------------------");

        Reservation reservation = new Reservation("king", 1, false);
        System.out.println("King room for 1 WEEKDAY night should cost $139.");
        System.out.println("Actual price: $" + reservation.getPrice());
        System.out.println();

        reservation.setWeekend(true);
        System.out.println("King room for 1 WEEKEND night costs $152.90.");
        System.out.println("Actual price: $" + reservation.getPrice());
        System.out.println();

        reservation.setRoomType("double");
        reservation.setWeekend(false);
        System.out.println("Double room for 1 WEEKDAY night costs $124.");
        System.out.println("Actual price: $" + reservation.getPrice());
        System.out.println();

        reservation.setWeekend(true);
        System.out.println("Double room for 1 WEEKEND night costs $136.40");
        System.out.println("Actual price: $" + reservation.getPrice());
    }

    public static void employeeTests()
    {
        System.out.println();
        System.out.println("Employee Tests");
        System.out.println("-----------------------------");
    }
}