package com.pluralsight;

import java.time.LocalDate;

public class Person
{
    private int id;
    private String firstName;
    private String lastName;
    private LocalDate birthDate;

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public LocalDate getBirthDate()
    {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate)
    {
        this.birthDate = birthDate;
    }

    // methods
    public void haveLunch()
    {
        System.out.printf("%s is having lunch. (in Person Class)\n", firstName);
    }
}

