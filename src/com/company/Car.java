package com.company;

import java.util.Random;

public class Car
{
    public final String producer;
    public final String model;
    public Double value;
    public Double mileage;
    public String color;
    public String segment;
    public static Double washPrice = 50.0;

    public Car(String producer,String model,Double value, Double mileage, String color, String segment)
    {
        this.producer = producer;
        this.model = model;
        this.value = value;
        this.mileage = mileage;
        this.color = color;
        this.segment = segment;
    }
    public void wash(Player player)
    {
        player.cash-=washPrice;
        System.out.println("You paid 50.0$ for car washing!");
    }
    public void buy(Player player, AutoBot bot)
    {
        if (player.cash >= value + washPrice + (value*0.02))
        {
            player.cash-=value;
            player.cash-=this.value*0.02;
            AutoBot.cash +=value;
            Player.setCar(this, Player.findFreeSpace());
            bot.setCar(null, bot.findInGarage(this));
            bot.garage = null;
            System.out.println("You bought "+this+"\nRemember you paid 2% car tax!");
            Car.this.wash(player);
            System.out.println("Account balance: "+player.cash);
        }
        else if (player.cash < value + washPrice + (value*0.02))
        {
            System.out.println("You don't have enough money");
        }
    }
    public void sell(Player player, AutoBot bot, Human[] humans)
    {
        Random rn = new Random();
        int x = rn.nextInt(3) + 1;
        if(x == 1)
        {
            System.out.println("You lost one move.");
            System.out.println("The customer thought about it :(");
            Menu.choose(player,bot,humans);
        }
        else
            {
            player.cash += value;
            player.cash -= this.value * 0.02;
            Car.this.wash(player);
            Human[].setCar(this, Human[].findFreeSpace());
            Player.setCar(null, Player.findInGarage(this));
            System.out.println("You sold " + this + "\nRemember you paid 2% car tax!");
            System.out.println("Account balance: " + player.cash);
        }
    }
    public String toString() {return this.producer+" "+this.model+" which costs "+ this.value+", from "+segment+" segment.";}
}
