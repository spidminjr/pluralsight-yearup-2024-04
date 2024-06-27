package com.pluralsight;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) throws Exception
    {
        String connectionString = "jdbc:mysql://localhost:3306/world";
        String username = "root";
        String password = "YUm15510n";

        Connection connection = DriverManager.getConnection(connectionString,
             username,
                password
        );


        String sql = """
                SELECT ID
                    , Name
                    , CountryCode
                    , District
                    ,Population
                FROM city;    
                """;


        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);

        while(row.next())
        {
            int id = row.getInt("Id");
            String city = row.getString("CountryCode");
            String 
        }


        connection.close();
    }
}