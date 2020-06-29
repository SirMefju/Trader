package com.company.options;

import com.company.Player;

import java.util.Scanner;

public class Seventh
{
    public static void seventh(Player me)
    {
        System.out.println("Which advertisement u want to buy?");
        System.out.println("[1] Advertisement in Newspaper for 1000.0$");
        System.out.println("[2] Advertisement in WebSite for 500.0$");
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        if(x==1)
        {
            System.out.println("You bought advertisement in Newspaper!");
            me.cash-=1000.0;
            System.out.println("Account balance: "+me.cash);
            boolean advertisement == 1;
        }
        else if(x==2)
        {
            me.cash-=500.0;
        }
        else
        {
            System.out.println("Wrong choice!");
            Seventh.seventh(me);
        }
    }
}
