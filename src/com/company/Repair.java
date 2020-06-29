package com.company;
import java.util.Random;
import java.util.Scanner;
public class Repair
{
    private static String part;
    public static void repair(Player player)
    {
        System.out.println("Which one mechanic u want?");
        System.out.println("[1] Janush.\n[2] Marian.\n[3] Adrian.");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        if (a == 1)
        {
            System.out.println("You chose mechanic Janush");
            switch (part)
            {
                case "breaks":
                    player.cash -= 150.0;
                    break;
                case "suspension":
                    player.cash -= 130.0;
                    break;
                case "engine":
                    player.cash -= 110.0;
                    break;
                case "body":
                    player.cash -= 143.0;
                    break;
                case "transmission":
                    player.cash -= 1230.0;
                    break;
            }
        }
        else if (a == 2)
        {
            System.out.println("You chose mechanic Marian");
            Random rn = new Random();
            int x = rn.nextInt(10) + 1;
            switch (part)
            {
                case "breaks":
                    player.cash -= 100.0;
                    if(x==5)
                        Repair.repair(player);
                    break;
                case "suspension":
                    player.cash -= 130.0;
                    if(x==5)
                        Repair.repair(player);
                    break;
                case "engine":
                    player.cash -= 110.0;
                    if(x==5)
                        Repair.repair(player);
                    break;
                case "body":
                    player.cash -= 1330.0;
                    if(x==5)
                        Repair.repair(player);
                    break;
                case "transmission":
                    player.cash -= 2560.0;
                    if(x==5)
                        Repair.repair(player);
                    break;
            }
        }
        else if (a == 3)
        {
            Random rn = new Random();
            int x = rn.nextInt(10) + 1;
            System.out.println("You chose mechanic Adrian");
            switch (part)
            {
                case "breaks":
                    player.cash -= 150.0;
                    if(x==5||x==6)
                        Repair.repair(player);
                    break;
                case "suspension":
                    player.cash -= 130.0;
                    if(x==5||x==6)
                        Repair.repair(player);
                    break;
                case "engine":
                    player.cash -= 110.0;
                    if(x==5||x==6)
                        Repair.repair(player);
                    break;
                case "body":
                    player.cash -= 1330.0;
                    if(x==5||x==6)
                        Repair.repair(player);
                    break;
                case "transmission":
                    player.cash -= 2560.0;
                    if(x==5||x==6)
                        Repair.repair(player);
                    break;
            }
        }
        else
        {
            System.out.println("Wrong choice!");
            Repair.repair(player);
        }
    }
}
