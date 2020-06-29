package com.company.options;
import com.company.Player;

import java.util.Scanner;

public class Ninth
{
    public static void ninth(Player me)
    {
        System.out.println("Do you want check buying or selling history?");
        System.out.println("[1] Buying\n[2] Selling");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        if (a == 1)
        {
            System.out.println("buying history");
        }
        else if ( a == 2)
        {
            System.out.println("selling history");
        }
        else
        {
            System.out.println("Wrong choice!");
            Ninth.ninth(me);
        }
    }
}
