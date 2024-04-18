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
        String model, carrier, owner, phoneNumber;
        int serialNumber;

        System.out.print("What is the phone serial number? ");
        serialNumber = userInput.nextInt();
        userInput.nextLine();

        System.out.print("What model is the phone? ");
        model = userInput.nextLine();

        System.out.print("Who is the carrier? ");
        carrier = userInput.nextLine();

        System.out.print("What is the phone number? ");
        phoneNumber = userInput.nextLine();

        System.out.print("Who is the owner of the phone? ");
        owner = userInput.nextLine();

        phoneUser.setSerialNumber(serialNumber);
        phoneUser.setModel(model);
        phoneUser.setCarrier(carrier);
        phoneUser.setPhoneNumber(phoneNumber);
        phoneUser.setOwner(owner);

        return phoneUser;
    }

    public static void greetGuest(CellPhone guest)
    {
        System.out.println();
        System.out.println("Welcome ");
    }
}