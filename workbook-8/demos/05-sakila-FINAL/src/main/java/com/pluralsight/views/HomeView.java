package com.pluralsight.views;

import java.util.Scanner;

public class HomeView extends ViewBase
{
    public int getUserSelection()
    {
        System.out.println();
        System.out.println("Sakila Home");
        System.out.println("-".repeat(40));
        System.out.println("1) Actors");
        System.out.println("2) Films");

        System.out.println("0) Exit");
        System.out.println();
        System.out.print("Please select an option: ");

        return Integer.parseInt(in.nextLine());
    }
}
