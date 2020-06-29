package com.company;

public class Player
{
    public String firstName;
    public static Double cash = 100000.0;
    public static Car[] garage;
    public Player(String firstName, Double cash, Integer garageSize)
    {
        this.firstName = firstName;
        Player.cash = cash;
        garage = new Car[garageSize];
    }
    public static void setCar(Car car, int index)
    {
        garage[index] = car;
    }
    public static void playerGarage()
    {
        garage = new Car[3];
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
}
