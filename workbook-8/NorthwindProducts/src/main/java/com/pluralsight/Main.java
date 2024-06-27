package com.pluralsight;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        String connectionString = "jdbc:mysql//localhost:3306/northwind";
        String username = "root";
        String password = "YUm15510n";


        

        try (Connection connection = DriverManager.getConnection(connectionString, username, password))
        {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String sql = """
                SELECT ProductId
                     , ProductName
                     , UnitPrice
                     , UnitsInStock
                FROM products     
                """;

            System.out.println();
            System.out.println(sql);
            System.out.println();
        }
        catch(Exception e)
        {

        }
    }
}