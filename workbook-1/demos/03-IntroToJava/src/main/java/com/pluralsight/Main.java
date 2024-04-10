package com.pluralsight;

public class Main
{
    public static void main(String[] args)
    {
        //System.out.println("Hello world!");
        // variable naming
        //must start with a letter or _
        //cannot have spaces in the name
        //camelCasing
        // snake_case -- not really used in java
        //UPPER_CASE -- in java this is for constants
        // kebab-case -- does not work in java (but used in other languages)

        // declare variable that has the count of kids on a bus
        byte countOfKidsOnBus;
        countOfKidsOnBus = 127;

        System.out.println("Kids on bus: " + countOfKidsOnBus);
        // declare a variable that has acount of the number of the buses in the school district
        int countOfBusesInDistrict = 12;
        System.out.println("Buses in the school district: " + countOfBusesInDistrict);

        //price of chocolate
        double priceOfChocolate = 1.5;

        // are all of the kids on the bus?
        boolean kidsOnBus = true;

        // the first letter of the alphabet
        char firstLetter = 'a';

        // name of your favorite restaurant
        String favoriteRestaurant = "Texas Roadhouse";
    }
}