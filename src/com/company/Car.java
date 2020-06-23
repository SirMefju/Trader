package com.company;

import com.company.options.Second;

public class Car
{
    public final String producer;
    public final String model;
    public static Double value = 1000.0;
    public Double mileage;
    public String color;
    public String part;
    public static Double washPrice = 50.0;

    public Car(String producer,String model,Double value, Double mileage, String color, String part)
    {
        this.producer = producer;
        this.model = model;
        Car.value = value;
        this.mileage = mileage;
        this.color = color;
        this.part = part;
    }
    public static void wash()
    {
        Player.cash-=washPrice;
        System.out.println("You paid 50.0$ for car washing!");
    }
    public void buy()
    {
        if (Player.cash >= value + washPrice + (value*0.02))
        {
            Player.cash-=value;
            Player.cash-=value*0.02;
            AutoBot.cash+=value;
            Player.setCar(this);
            AutoBot.garage = null;
            System.out.println("You bought "+this+"\nRemember you paid 2% car tax!");
            Car.wash();
            System.out.println("Account balance: "+Player.cash);
        }
        else if (Player.cash < value + washPrice + (value*0.02))
        {
            System.out.println("You don't have enough money");
            Second.second();
        }
    }
    public String toString() {return this.producer+" "+this.model+" which costs "+value+" with broken "+part;}
}
