package com.pluralsight;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args)
    {
        ArrayList<Asset> asset = new ArrayList<>();

        asset.add(new House("My house", "2020-01-01", 250000.00, "123 Main St", 1, 2000, 5000));
        asset.add(new House("Vacation home", "2018-06-15", 350000.00, "456 Beach Blvd", 2, 1500, 8000));


        asset.add(new Vehicle("Tom's truck", "2017-05-20", 30000.00, "Toyota Tacoma", 2015, 50000));
        asset.add(new Vehicle("Family car", "2019-10-10", 40000.00, "Honda Accord", 2016, 30000));


        for (Asset currentAsset : asset) {
            System.out.println("Description: " + currentAsset.getDescription());
            System.out.println("Date Acquired: " + currentAsset.getDateAcquired());
            System.out.println("Original Cost: $" + currentAsset.getOriginalCOst());
            System.out.println("Value: $" + currentAsset.getValue());


            if (currentAsset instanceof House) {
                House house = (House) currentAsset;
                System.out.println("Address: " + house.getAddress());
            } else if (currentAsset instanceof Vehicle) {
                Vehicle vehicle = (Vehicle) currentAsset;
                System.out.println("Year & Make/Model: " + vehicle.getYear() + " " + vehicle.getMakeModel());
            }

            System.out.println();
        }
    }
    }