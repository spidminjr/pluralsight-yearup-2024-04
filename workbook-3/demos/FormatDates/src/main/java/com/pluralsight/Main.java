package com.pluralsight;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalField;

public class Main
{
    public static void main(String[] args)
    {
        dateOnly();
    }

    public static void dateOnly()
    {
        LocalDate today = LocalDate.now();
        LocalDateTime now = LocalDateTime.now();
        ZonedDateTime gmtNow = now.atZone(ZoneId.of("GMT"));
        ZonedDateTime utcNow = ZonedDateTime.now(ZoneId.of("US/Pacific"));
        System.out.println(today);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(today.format(formatter));
        System.out.println();

        System.out.println(today.getMonth() + " " + today.getDayOfMonth() + ", " + today.getYear());

        System.out.println(today.getDayOfWeek() + ", " + today.getMonth() + " " + today.getDayOfMonth() + ", " + today.getYear() + ", " + gmtNow );

        System.out.println(utcNow + " on " + today.format(formatter));

    }
}