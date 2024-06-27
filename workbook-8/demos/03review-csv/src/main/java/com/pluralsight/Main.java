package com.pluralsight;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("files/cities.csv");

        Scanner scanner = new Scanner(file);

        scanner.nextLine();

        while(scanner.hasNextLine())
        {
            String line = scanner.nextLine();
            String[] columns = line.split("\\|");

            int id = Integer.parseInt(columns[0]);
            String city = columns[1];
            String country = columns[2];
            String state = columns[3];
            int population = Integer.parseInt(columns[4]);

            System.out.printf("%4d: %-20s %3s %-15s \n", id, city, country, state, population);
        }



        scanner.close();
    }
}