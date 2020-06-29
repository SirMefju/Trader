package com.company;

public class Human {
    public String firstName;
    public Double cash;
    public static Car[] garage;

    public Human(String firstName, Double cash, Integer garageSize)
    {
        this.firstName = firstName;
        this.cash = cash;
        garage = new Car[garageSize];
    }
    public void setCar(Car car, int index)
    {
        garage[index] = car;
    }
    public int findFreeSpace()
    {
        for (int i = 0; i < garage.length; i++)
        {
            if (garage[i] == null) return i;
        }
        return -1;
    }
    public int findInGarage(Car car)
    {
        for (int i = 0; i < garage.length; i++)
        {
            if (garage[i] == car) return i;
        }
        return -1;
    }
}
