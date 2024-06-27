package com.pluralsight.application;

import org.apache.commons.dbcp2.BasicDataSource;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class WorldApp
{
    DataSource datasource;

    public WorldApplication()
    {
        this.datasource = buildDataSource();
    }

    private DataSource buildDataSource()
    {
        try(FileInputStream stream = new FileInputStream("src/main/resources/config.properties"))
        {
            Properties properties = new Properties();
            properties.load(stream);

            String connectionString = properties.getProperty("db.connectionString");
            String username = properties.getProperty("db.username");
            String password = properties.getProperty("db.password");

            BasicDataSource dataSource = new BasicDataSource();
            dataSource.setUrl(connectionString);
            dataSource.setUsername(username);
            dataSource.setPassword(password);

            return dataSource;
        }
        catch(IOException e)
        {
            throw new RuntimeException(e);
        }
    }
}
