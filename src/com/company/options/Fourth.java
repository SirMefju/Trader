package com.company.options;

import com.company.Player;
import com.company.Repair;

import java.util.Scanner;

public class Fourth
{
    public static void fourth(Player me)
    {
        System.out.println("Which car you want to repair?");
        for (int i = 0; i < Player.garage.length; i++)
        {
            System.out.println(Player.garage[i]);
        }
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        if (a == 1)
        {
            Repair.repair(me);
        }
        else if (a == 2)
        {
            Repair.repair(me);
        }
        else if (a == 3)
        {
            Repair.repair(me);
        }
        else
        {
            System.out.println("Wrong choice!");
            Fourth.fourth(me);
        }

    }
}
