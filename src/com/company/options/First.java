package com.company.options;

import com.company.AutoBot;
import com.company.Player;

public class First
{
    public static void first(Player me)
        {
            System.out.println("Available cars for you:");
            AutoBot.botGarage();
            for(int i = 0; i<AutoBot.garage.length; i++)
            {
                System.out.println(AutoBot.garage[i]);
            }
        }
}
