package com.pluralsight.applicaton;

import com.pluralsight.models.Employee;
import com.pluralsight.models.Person;
import com.pluralsight.services.PeopleBuilder;
import com.pluralsight.ui.UserInterface;
import com.pluralsight.ui.enumerations.UserChoice;

import java.util.ArrayList;
import java.util.List;

public class PeopleApp
{
    private List<Person> people;
    private List<Employee> employees;

    public PeopleApp()
    {
        people = PeopleBuilder.createPeopleList();
        employees = new ArrayList<>();
    }

    public void run()
    {
        while(true)
        {
            UserChoice choice = UserInterface.getHomeScreenSelection();

            switch(choice)
            {
                case SearchName -> searchByName();
                case SearchAge -> searchByAge();
                case CalculateAverageAge -> calculateAverageAge();
                case DisplayOldestAge -> displayOldestAge();
                case DisplayYoungestAge -> displayYoungestAge();
                case SortYoungestFirst -> sortYoungestFirst();
                case SortOldestFirst -> sortOldestFirst();
                case CreateEmployees -> createEmployees();
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

    private void searchByName()
    {
        // prompt user for first name and display all people with that name
    }

    private void searchByAge()
    {
        // prompt user for an age and display all people with that age
    }

    private void calculateAverageAge()
    {
        // calculate and display the average age of all people in the list
    }

    private void displayOldestAge()
    {
        // find and display the age of the oldest person in the list
        // don't display the person's info, just their age
    }

    private void displayYoungestAge()
    {
        // find and display the age of the younges person in the list
        // don't display the person's info, just their age
    }

    private void sortYoungestFirst()
    {
        // display all info for all people, sorted by age, youngest first
    }

    private void sortOldestFirst()
    {
        // display all info for all people, sorted by age, youngest first
    }

    private void createEmployees()
    {
        // populate the list of Employees with...
        // create a new Employee for each person in your people list
        // the salary of each employee is based on their age $3,000 per year
        // i.e. a 10 year old = $30,000, a 40 year old = $120,000 etc

        // display all of the employee information for each employee
        // lastName, firstName (age) - $ salary
    }
}
