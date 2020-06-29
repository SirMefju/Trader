package com.company.options;

import com.company.Player;

public class Third
{
    public static void third(Player me)
    {
        System.out.println("Your cars:");
        Player.playerGarage();
        for (int i = 0; i < Player.garage.length; i++)
        {
            System.out.println(Player.garage[i]);
        }
    }
}
