package com.pluralsight;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter name of the file (goldilocks, hansel_and_gretel, mary_had_a_little_lamb): ");
        String fileName = userInput.nextLine().trim().toLowerCase();

        String filePath = "BedtimeStories/files/goldilocks.txt";

        File file = new File(filePath);

        try(Scanner fileScanner = new Scanner(file))
        {
            int lineNumber = 1;

            while(fileScanner.hasNextLine())
            {
                String line = fileScanner.nextLine();
                System.out.println(lineNumber + ": " + line);
                lineNumber++;
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}