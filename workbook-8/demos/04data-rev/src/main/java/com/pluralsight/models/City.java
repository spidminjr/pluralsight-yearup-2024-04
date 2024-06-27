package com.pluralsight.models;

public class City
{
    private int id;
    private String name;
    private String country;
    private int population;


    public City(int id, String name, String country, int population) {
        this.id = id;
        this.name = name;
        this.country = country;
        this.population = population;
    }

    public City()
    {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }
}
