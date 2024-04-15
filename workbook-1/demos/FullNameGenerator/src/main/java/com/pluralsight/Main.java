package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        commonMethods();
    }

    public static void commonMethods()
    {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter your first name: ");
        String firstName = userInput.nextLine().trim();
        //String formattedPhone = firstName.replace("-", "")
                //.replace("(", "")
               // .replace(")", "")
               // .replace(" ", "")
               // .replace(".", "");

        System.out.print("Enter your Middle name: ");
        String middleName = userInput.nextLine().trim();

        System.out.print("Enter your last name: ");
        String lastName = userInput.nextLine().trim();

        System.out.print("Enter Suffix: ");
        String suffix = userInput.nextLine().trim();




        System.out.println("Full name: " + firstName + " " + middleName + " " + lastName + " " + suffix);
    }
}