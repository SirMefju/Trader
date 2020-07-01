package com.company;

public class Player
{
    public String firstName;
    public Double cash;
    public static Car[] garage;
    public Player(String firstName, Double cash, Integer garageSize)
    {
        this.firstName = firstName;
        this.cash = cash;
        garage = new Car[garageSize];
    }
    public static void setCar(Car car, int index)
    {
        garage[index] = car;
    }
    public static int findFreeSpace()
    {
        for (int i = 0; i < garage.length; i++)
        {
            if (garage[i] == null) return i;
        }
        return -1;
    }
    public static int findInGarage(Car car)
    {
        for (int i = 0; i < garage.length; i++)
        {
            if (garage[i] == car) return i;
        }
        return -1;
    }
    public String toString() {return this.firstName;}
}
