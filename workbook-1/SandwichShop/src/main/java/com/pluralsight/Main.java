package com.pluralsight;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        final int regularSandwich = 1;
        final double regularSandwichPrice = 5.45;
        final int largeSandwich = 2;
        final double largeSandwichPrice = 8.95;

        System.out.print("What sandwich option would you like 1 for regular or 2 for large? ");
        int sandwichOption = scanner.nextInt();

        System.out.print("What is your age?");
        int age = scanner.nextInt();

        double discount;
        if(age <= 17) {
            discount = 0.1;
        } else if (age >= 65) {
            discount = 0.2;
        } else {
            discount = 0.0;
        }

        double totalPrice;
        if (sandwichOption == regularSandwich) {
            totalPrice = regularSandwichPrice * (1 - discount);
        } else if (sandwichOption == largeSandwich) {
            totalPrice = largeSandwichPrice * (1 - discount);
        } else {
            System.out.print("Invalid size selection");
            return;
        }

        System.out.print("Total price is $" + String.format("%.2f", totalPrice));

        System.out.println(" Enjoy your meal!");
    }
}