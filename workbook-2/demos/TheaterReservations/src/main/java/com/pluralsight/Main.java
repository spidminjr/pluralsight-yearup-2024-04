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

        System.out.print("What date will you be coming (MM/dd/yyyy)?");
        String date = userInput.nextLine();

        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate ticketDay = LocalDate.parse(date, dateFormatter);

        System.out.print("How many tickets would you like? ");
        String tickets = userInput.nextLine();
        int ticketsCount = Integer.parseInt(tickets);

        if(ticketsCount > 1)
        {
            System.out.println(ticketsCount + " tickets reserved for " + ticketDay + " under " + fullName);
        }
        else {
            System.out.println(ticketsCount + " ticket reserved for " + ticketDay + " under " + fullName);
        }
    }
}