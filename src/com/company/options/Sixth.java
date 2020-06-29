package com.company.options;

import com.company.AutoBot;
import com.company.Player;

import java.util.Scanner;

public class Sixth
{
    public static void sixth(Player me, AutoBot bot)
    {
        System.out.println("Which one u want to sell?");
        for (int i = 0; i < Player.garage.length; i++)
        {
            System.out.println(Player.garage[i]);
        }
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        if (a == 1)
        {
            Player.garage[0].sell(me,bot);
        }
        else if (a == 2)
        {
            Player.garage[1].sell(me,bot);
        }
        else if ( a == 3)
        {
            Player.garage[2].sell(me,bot);
        }
        else if ( a == 4)
        {
            Player.garage[3].sell(me,bot);
        }
        else if ( a == 5)
        {
            Player.garage[4].sell(me,bot);
        }
        else
        {
            System.out.println("Wrong choice!");
            Sixth.sixth(me,bot);
        }
    }
}
