package com.pluralsight;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Intro to Arrays");

        //int[] numbers;
        //String[] names;
        //Person[] people;


        // numbers
        int[] numbers;
        numbers = new int[6];
        numbers[0] = 13;
        numbers[1] = 5;
        numbers[2] = 97;
        numbers[3] = 45;
        numbers[4] = 33;
        numbers[5] = 78;

        for(int i = 0; i < numbers.length; i++)
        {
            System.out.println(numbers[i]);
        }

        // Strings
        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday","Thursday", "Friday", "Saturday"};

        // Custom classes

        Person[] people =
                {
                        
                };
    }
}