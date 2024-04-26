package com.pluralsight;

import com.pluralsight.io.Logger;

public class Main
{
    public static void main(String[] args)
    {
        Logger logger = new Logger("demo");
        logger.logMessage("info", "application start");


        var logEntries = logger.readLog();
        for(var logEntry : logEntries)
        {
            System.out.println(logEntry.getMessage());
        }


        logger.logMessage("info","application end");
    }
}