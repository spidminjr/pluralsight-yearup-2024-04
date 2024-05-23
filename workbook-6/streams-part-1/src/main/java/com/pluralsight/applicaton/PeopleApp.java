package com.pluralsight.applicaton;

import com.pluralsight.models.Employee;
import com.pluralsight.models.Person;
import com.pluralsight.services.PeopleBuilder;
import com.pluralsight.ui.UserInterface;
import com.pluralsight.ui.enumerations.UserChoice;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class PeopleApp
{
    private List<Person> people;

    public void run()
    {
        while(true)
        {
            // create the list of employees each time so we have a clean list to work with
            people = PeopleBuilder.createPeopleList();

            UserChoice choice = UserInterface.getHomeScreenSelection();

            switch(choice)
            {
                case SearchName -> searchByName();
                case SearchAge -> searchByAge();
                case CalculateAverageAge -> displayAverageAge();
                case DisplayOldestAge -> displayOldestAge();
                case DisplayYoungestAge -> displayYoungestAge();
                case SortYoungestFirst -> displaySortedYoungestFirst();
                case SortOldestFirst -> displaySortedOldestFirst();
                case CreateEmployees -> displayEmployees();
                case ShowAll -> showAll();
                case Exit -> System.exit(0);
            }
        }
    }

    private void showAll()
    {
        // this is a hidden option 99
        UserInterface.displayPeople(people, "List of All People");
    }



    /* ********************************************
    BEGIN Search by name
    ********************************************* */
    private void searchByName()
    {
        // prompt user for first name and display all people with that name
        String name = UserInterface.getSearchNameFromUser();
        List<Person> searchResults = findPeople(people, name);
        UserInterface.displayPeople(searchResults, "Search people by name: " + name);
    }

    private List<Person> findPeople(List<Person> people, String name)
    {
        // search for people by first name
        // return a new List<Person> with the search results
        return new ArrayList<>();
    }
    /* ********************************************
    END Search by name
    ********************************************* */



    /* ********************************************
    BEGIN Search by age
    ********************************************* */
    private void searchByAge()
    {
        // prompt user for an age and display all people with that age
        int age = UserInterface.getSearchAgeFromUser();
        List<Person> searchResults = findPeople(people, age);
        UserInterface.displayPeople(searchResults, "Search people by age: " + age);
    }

    private List<Person> findPeople(List<Person> people, int age)
    {
        return new ArrayList<>();
    }
    /* ********************************************
    END Search by age
    ********************************************* */



    /* ********************************************
    BEGIN Display average age
    ********************************************* */
    private void displayAverageAge()
    {
        // calculate and display the average age of all people in the list
        int averageAge = calculateAverageAge(people);
        UserInterface.displayMessage("The average age of all people is: " + averageAge);
    }

    private int calculateAverageAge(List<Person> people)
    {
        return 0;
    }
    /* ********************************************
    END Display average age
    ********************************************* */



    /* ********************************************
    BEGIN Display oldest age
    ********************************************* */
    private void displayOldestAge()
    {
        // find and display the age of the oldest person in the list
        // don't display the person's info, just their age
        int oldest = findOldestAge(people);
        UserInterface.displayMessage(STR."The oldest person is: \{oldest} years old");
    }

    private int findOldestAge(List<Person> people)
    {
        return 0;
    }
    /* ********************************************
    END Display oldest age
    ********************************************* */



    /* ********************************************
    BEGIN Display youngest age
    ********************************************* */
    private void displayYoungestAge()
    {
        // find and display the age of the youngest person in the list
        // don't display the person's info, just their age
        int youngest = findYoungestAge(people);
        UserInterface.displayMessage(STR."The youngest person is: \{youngest} years old");
    }

    private int findYoungestAge(List<Person> people)
    {
        return 0;
    }
    /* ********************************************
    BEGIN Display youngest age
    ********************************************* */



    /* ********************************************
    BEGIN Sort youngest first
    ********************************************* */
    private void displaySortedYoungestFirst()
    {
        // display all info for all people, sorted by age, youngest first
        List<Person> sortedList = sortYoungestFirst(people);
        UserInterface.displayPeople(sortedList, "People sorted by age - youngest first");
    }

    private List<Person> sortYoungestFirst(List<Person> people)
    {
        return new ArrayList<>();
    }
    /* ********************************************
    END Sort youngest first
    ********************************************* */



    /* ********************************************
    BEGIN Sort oldest first
    ********************************************* */
    private void displaySortedOldestFirst()
    {
        // display all info for all people, sorted by age, youngest first
        List<Person> sortedList = sortOldestFirst(people);
        UserInterface.displayPeople(sortedList, "People sorted by age - oldest first");
    }

    private List<Person> sortOldestFirst(List<Person> people)
    {
        return new ArrayList<>();
    }
    /* ********************************************
    END Sort oldest first
    ********************************************* */



    /* ********************************************
    BEGIN Create employees
    ********************************************* */
    private void displayEmployees()
    {
        // display all people as employees
        List<Employee> employees = createEmployees(people);
        UserInterface.displayEmployees(employees);
    }

    private List<Employee> createEmployees(List<Person> people)
    {
        // populate the list of Employees with...
        // create a new Employee for each person in your people list
        // the salary of each employee is based on their age $3,000 per year
        // i.e. a 10 year old = $30,000, a 40 year old = $120,000 etc
        return new ArrayList<>();
    }
    /* ********************************************
    END Create employees
    ********************************************* */
}
