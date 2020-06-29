package com.company.options;

import com.company.AutoBot;
import com.company.Player;

import java.util.Scanner;

public class Sixth
{
    public static void sixth()
    {
        System.out.println("Which one u want to sell?");
        Player.playerGarage();
        for (int i = 0; i < Player.garage.length; i++)
        {
            System.out.println(Player.garage[i]);
        }
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        if (a == 1)
        {
            Player.garage[0].sell();
        }
        else if (a == 2)
        {
            Player.garage[1].sell();
        }
        else if ( a == 3)
        {
            Player.garage[2].sell();
        }
        else
        {
            System.out.println("Wrong choice!");
            Sixth.sixth();
        }
    }
}
