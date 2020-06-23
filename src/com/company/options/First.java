package com.company.options;

import com.company.AutoBot;

public class First
{
    public static void first()
        {
            System.out.println("Available cars for you:");
            AutoBot.botGarage();
            for(int i = 0; i<AutoBot.garage.length; i++)
            {
                System.out.println(AutoBot.garage[i]);
            }
        }
}
