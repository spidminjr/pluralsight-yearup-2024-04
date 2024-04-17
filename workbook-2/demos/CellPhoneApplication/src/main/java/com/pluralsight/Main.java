package com.pluralsight;

import java.util.Scanner;

public class Main
{
    private static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args)
    {
        CellPhone eventPhone = register();
    }

    public static CellPhone register()
    {
        CellPhone phoneUser = new CellPhone();
        String model, carrier, owner;
        int serialNumber, phoneNumber;

        System.out.print("What is the phone serial number? ");
        serialNumber = userInput.nextInt();

        System.out.print("What model is the phone? ");
        model = userInput.next();

        System.out.print("Who is the carrier? ");
        carrier = userInput.next();

        System.out.print("What is the phone number? ");
        phoneNumber = userInput.nextInt();

        System.out.print("Who is the owner of the phone? ");
        owner = userInput.next();

        phoneUser.setSerialNumber(serialNumber);

        return phoneUser;
    }
}