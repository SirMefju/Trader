package com.company.options;
import com.company.AutoBot;
import com.company.Car;
import com.company.Player;

import java.util.Scanner;
public class Second
{
    public static void second(Player me, AutoBot bot)
    {
        System.out.println("At this moment available cars for You:");
        int rndC1 = (int) (Math.random() * bot.garage.length);
        int rndC2 = (int) (Math.random() * bot.garage.length);
        int rndC3 = (int) (Math.random() * bot.garage.length);

        Car randomCar1 = bot.garage[rndC1];
        System.out.println(randomCar1);
        if(rndC1!=rndC2)
        {
            Car randomCar2 = bot.garage[rndC2];
            System.out.println(randomCar2);
        }
        if(rndC1!=rndC3&&rndC2!=rndC3)
        {
            Car randomCar3 = bot.garage[rndC3];
            System.out.println(randomCar3);
        }
        System.out.println("Which one u want?");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        if (a == 1)
        {
            bot.garage[rndC1].buy(me,bot);
        }
        else if(a == 2)
        {
            bot.garage[rndC2].buy(me,bot);
        }
        else if(a == 3)
        {
            bot.garage[rndC3].buy(me,bot);
        }
        else
        {
            System.out.println("Wrong choice!");
            Second.second(me,bot);
        }
    }
}
