package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        fullName();
    }

    public static void fullName()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your full name: ");
        String fullName = scanner.nextLine();

        String firstName = "";
        String middleName = "";
        String lastName = "";

        String[] nameParts = fullName.split(" ");

        firstName = nameParts[0];

        boolean hasMiddleName = nameParts.length > 2;
        if (hasMiddleName)
        {
            middleName = nameParts[1];
            lastName = nameParts[2];

        }
        else
        {
            lastName = nameParts[1];
        }

        System.out.println();
        System.out.printf("First Name: %s \n", firstName);
        System.out.printf("Middle Name: %s \n", middleName);
        System.out.printf("Last Name: %s \n", lastName);
    }
}