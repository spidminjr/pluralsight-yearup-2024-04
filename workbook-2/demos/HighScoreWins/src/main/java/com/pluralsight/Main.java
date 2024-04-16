package com.pluralsight;

public class Main
{
    public static void main(String[] args)
    {
        String input = "Slytherin:Gryffindor|23:59";

        String[] parts = input.split(":|");

        System.out.println(parts[0]);
        System.out.println(parts[1]);
        System.out.println(parts[2]);
        System.out.println(parts[3]);
    }
}