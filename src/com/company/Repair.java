package com.company;
import java.util.Random;
import java.util.Scanner;
public class Repair
{
    private static String part;
    public static void repair()
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
                    Player.cash -= 150.0;
                    break;
                case "suspension":
                    Player.cash -= 130.0;
                    break;
                case "engine":
                    Player.cash -= 110.0;
                    break;
                case "body":
                    Player.cash -= 143.0;
                    break;
                case "transmission":
                    Player.cash -= 1230.0;
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
                    Player.cash -= 100.0;
                    if(x==5)
                        Repair.repair();
                    break;
                case "suspension":
                    Player.cash -= 130.0;
                    if(x==5)
                        Repair.repair();
                    break;
                case "engine":
                    Player.cash -= 110.0;
                    if(x==5)
                        Repair.repair();
                    break;
                case "body":
                    Player.cash -= 1330.0;
                    if(x==5)
                        Repair.repair();
                    break;
                case "transmission":
                    Player.cash -= 2560.0;
                    if(x==5)
                        Repair.repair();
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
                    Player.cash -= 150.0;
                    if(x==5||x==6)
                        Repair.repair();
                    break;
                case "suspension":
                    Player.cash -= 130.0;
                    if(x==5||x==6)
                        Repair.repair();
                    break;
                case "engine":
                    Player.cash -= 110.0;
                    if(x==5||x==6)
                        Repair.repair();
                    break;
                case "body":
                    Player.cash -= 1330.0;
                    if(x==5||x==6)
                        Repair.repair();
                    break;
                case "transmission":
                    Player.cash -= 2560.0;
                    if(x==5||x==6)
                        Repair.repair();
                    break;
            }
        }
        else
        {
            System.out.println("Wrong choice!");
            Repair.repair();
        }
    }
}
