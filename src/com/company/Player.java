package com.company;

public class Player
{
    public String firstName;
    public static Double cash = 1000000.0;
    public static Car[] garage;
    public void player(String firstName, Double cash, Integer garageSize)
    {
        this.firstName = firstName;
        Player.cash = cash;
        garage = new Car[garageSize];
    }

    public static void setCar(Car car)
    {

    }
    public static void playerGarage()
    {
        garage = new Car[3];
    }

}
