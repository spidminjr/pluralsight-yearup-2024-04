package com.pluralsight.ui;

import com.pluralsight.models.Person;
import com.pluralsight.ui.enumerations.UserChoice;

import java.util.List;
import java.util.Scanner;

public class UserInterface
{
    private static final Scanner in = new Scanner(System.in);

    public static UserChoice getHomeScreenSelection()
    {
        while(true)
        {
            System.out.println();
            System.out.println("What do you want to do?");
            printLineSeparator();
            System.out.println("1) Search for user by name");
            System.out.println("2) Search for user by age");
            System.out.println("3) Calculate the average age");
            System.out.println("4) Display the Age of the oldest person");
            System.out.println("5) Display the Age of the youngest person");
            System.out.println("6) Display all people sorted by age (youngest to oldest)");
            System.out.println("7) Display all people sorted by age (oldest to youngest)");
            System.out.println("8) Create a list of Employees - display them");
            System.out.println("0) Exit");
            System.out.print("Please select an option: ");
            String choice = in.nextLine().strip();

            switch(choice)
            {
                case "1":
                    return UserChoice.SearchName;
                case "2":
                    return UserChoice.SearchAge;
                case "3":
                    return UserChoice.CalculateAverageAge;
                case "4":
                    return UserChoice.DisplayOldestAge;
                case "5":
                    return UserChoice.DisplayYoungestAge;
                case "6":
                    return UserChoice.SortYoungestFirst;
                case "7":
                    return UserChoice.SortOldestFirst;
                case "8":
                    return UserChoice.CreateEmployees;
                case "99":
                    return UserChoice.ShowAll;
                case "0":
                    return UserChoice.Exit;
                default:
                    System.out.println("The choice was invalid, please select from the list");
                    System.out.println();
            }
        }
    }
    private static void printLineSeparator()
    {
        System.out.println("*".repeat(50));
    }

    public static void displayPeople(List<Person> people, String reportTitle)
    {
        System.out.println();
        System.out.println(reportTitle);
        printLineSeparator();
        for(Person person: people)
        {
            displayPerson(person);
        }
    }

    private static void displayPerson(Person person)
    {
        System.out.printf("%s %s (%d) \n", person.getFirstName(), person.getLastName(), person.getAge());
    }
}
