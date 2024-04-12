package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);

        String employeeName;
        double hoursWorked;
        double payRate;


        System.out.print("Please enter your name: ");
        employeeName = userInput.nextLine();

        System.out.print("How many hours did you work this week ? ");
        hoursWorked = userInput.nextDouble();

        System.out.print("What's your current pay rate? ");
        payRate = userInput.nextDouble();

        double biWeekly = hoursWorked * payRate * 2;

        System.out.print("Your next paycheck total is: " + biWeekly);

    }
}