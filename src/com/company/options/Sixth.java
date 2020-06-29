package com.company.options;

import com.company.AutoBot;
import com.company.Human;
import com.company.Player;

import java.util.Scanner;

public class Sixth
{

    public static void sixth(Player me, AutoBot bot, Human[] humans)
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
            Sixth.client();
            Player.garage[0].sell(me,bot,humans[x]);
        }
        else if (a == 2)
        {
            Sixth.client();
            Player.garage[1].sell(me,bot,humans[x]);
        }
        else if ( a == 3)
        {
            Sixth.client();
            Player.garage[2].sell(me,bot,humans[x]);
        }
        else if ( a == 4)
        {
            Sixth.client();
            Player.garage[3].sell(me,bot,humans[x]);
        }
        else if ( a == 5)
        {
            Sixth.client();
            Player.garage[4].sell(me,bot,humans[x]);
        }
        else
        {
            System.out.println("Wrong choice!");
            Sixth.sixth(me,bot,humans);
        }
    }
    public static void client()
    {
        System.out.println("Which client u want?");
        Human[].humans;
        int rnd = (int) (Math.random() * humans.length);
        String cus = humans[rnd];
        System.out.println(cus);
        if(advertisement == true)
        {
            String cus1 = humans[rnd];
            System.out.println(cus1);
        }
        if(advertisementNet==true)
        {
            String cus2 = humans[rnd];
            String cus3 = humans[rnd];
            System.out.println(cus2);
            System.out.println(cus3);
        }
        Scanner in = new Scanner(System.in);
        int b = in.nextInt();
        if(b==1)
        {
            cus1==humans[x];
        }
        else if(b==2)
        {
            cus2==humans[x];
        }
        else if(b==3)
        {
            cus3==humans[x];
        }
        else
        {
            System.out.println("Wrong choice!");
            Sixth.client();
        }
    }
}
