package com.company;
public class Car
{
    public final String producer;
    public final String model;
    public static Double value;
    public Double mileage;
    public String color;
    public String segment;
    public static Double washPrice = 50.0;

    public Car(String producer,String model,Double value, Double mileage, String color, String segment)
    {
        this.producer = producer;
        this.model = model;
        Car.value = value;
        this.mileage = mileage;
        this.color = color;
        this.segment = segment;
    }
    public static void wash()
    {
        Player.cash-=washPrice;
        Player.cash-=value*0.02;
        System.out.println("You paid 50.0$ for car washing!");
    }
    public void buy()
    {
        if (Player.cash >= value + washPrice + (value*0.02))
        {
            Player.cash-=value;
            AutoBot.cash+=value;
            Player.setCar(this, Player.findFreeSpace());
            AutoBot.setCar(null, AutoBot.findInGarage(this));
            AutoBot.garage = null;
            System.out.println("You bought "+this+"\nRemember you paid 2% car tax!");
            Car.wash();
            System.out.println("Account balance: "+Player.cash);
        }
        else if (Player.cash < value + washPrice + (value*0.02))
        {
            System.out.println("You don't have enough money");
        }
    }
    public void sell()
    {
        Player.cash+=value;
        Car.wash();
        Human.setCar(this, Human.findFreeSpace());
        Player.setCar(null, Player.findInGarage(this));
        System.out.println("You sold "+this+"\nRemember you paid 2% car tax!");
        System.out.println("Account balance: "+Player.cash);

    }
    public String toString() {return this.producer+" "+this.model+" which costs "+ value+", from "+segment+" segment.";}
}
