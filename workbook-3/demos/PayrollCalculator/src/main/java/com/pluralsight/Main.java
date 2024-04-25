package com.pluralsight;

import java.io.File;
import java.io.IOError;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    private static ArrayList<Employee> employees = new ArrayList<>();

    public static void main(String[] args)
    {
        loadEmployees();
        for (Employee employee : employees) {
            System.out.println("Employee ID: " + employee.getEmployeeId());
            System.out.println("Employee Name: " + employee.getEmployeeName());
            System.out.println("Hours Worked: " + employee.getHoursWorked());
            System.out.println("Pay Rate: " + employee.getPayRate());
            System.out.println();
        }
    }

    public static void loadEmployees()
    {
        File file = new File("files/employees.csv");

        try(Scanner fileScanner = new Scanner(file))
        {
            fileScanner.nextLine();

            while(fileScanner.hasNext())
            {
                String line = fileScanner.nextLine();

                String[] columns = line.split("[|]");

                int employeeId = Integer.parseInt(columns[0]);
                String employeeName = columns[1];
                String hoursWorked = columns[2];
                double payRate = Double.parseDouble(columns[3]);

                Employee employee = new Employee(payRate, employeeId, employeeName, hoursWorked);

                employees.add(employee);
            }
        }
        catch(IOException ex)
        {

        }
    }
}