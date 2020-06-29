package com.company.options;
import com.company.AutoBot;
import com.company.Car;
import com.company.Menu;
import com.company.Player;

import java.util.Scanner;
public class Second
{
    public static void second(Player me)
    {
        AutoBot.botGarage();
        System.out.println("At this moment available cars for You:");
        int rndC1 = (int) (Math.random() * AutoBot.garage.length);
        int rndC2 = (int) (Math.random() * AutoBot.garage.length);
        int rndC3 = (int) (Math.random() * AutoBot.garage.length);

        Car randomCar1 = AutoBot.garage[rndC1];
        System.out.println(randomCar1);
        if(rndC1!=rndC2)
        {
            Car randomCar2 = AutoBot.garage[rndC2];
            System.out.println(randomCar2);
        }
        if(rndC1!=rndC3&&rndC2!=rndC3)
        {
            Car randomCar3 = AutoBot.garage[rndC3];
            System.out.println(randomCar3);
        }
        System.out.println("Which one u want?");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        if (a == 1)
        {
            AutoBot.garage[rndC1].buy();
        }
        else if(a == 2)
        {
            AutoBot.garage[rndC2].buy();
        }
        else if(a == 3)
        {
            AutoBot.garage[rndC3].buy();
        }
        else
        {
            System.out.println("Wrong choice!");
            Second.second(me);
        }
    }
}
