package com.pluralsight;

import java.util.Scanner;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import java.util.regex.Pattern;

public class Main
{
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        String fullName = userInput.nextLine();

        System.out.print("What date will you be coming (MM/DD/YYYY)?");
        String date = userInput.nextLine();

        System.out.print("How many tickets would you like? ");
        String tickets = userInput.nextLine();
    }
}