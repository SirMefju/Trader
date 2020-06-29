package com.company.options;

import com.company.*;

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
            Player.garage[0].sell(me,bot,getRandomClient(humans));
            Menu.choose(me,bot,humans);
        }
        else if (a == 2)
        {
            Player.garage[1].sell(me,bot,getRandomClient(humans));
            Menu.choose(me,bot,humans);
        }
        else if ( a == 3)
        {
            Player.garage[2].sell(me,bot,getRandomClient(humans));
            Menu.choose(me,bot,humans);
        }
        else if ( a == 4)
        {
            Player.garage[3].sell(me,bot,getRandomClient(humans));
            Menu.choose(me,bot,humans);
        }
        else if ( a == 5)
        {
            Player.garage[4].sell(me,bot,getRandomClient(humans));
            Menu.choose(me,bot,humans);
        }
        else
        {
            System.out.println("Wrong choice!");
            Sixth.sixth(me,bot,humans);
        }
    }
    public static Human getRandomClient(Human[] humans)
    {
        System.out.println("Which client u want?");
        int rnd1 = (int) (Math.random() * humans.length);
        int rnd2 = (int) (Math.random() * humans.length);
        Human cus = humans[rnd1];
        Human cus1 = humans[rnd2];
        System.out.println(cus);
        System.out.println(cus1);
        /*if(advertisementNet==true)
        {
            Human cus = humans[rnd];
            System.out.println(cus);
        }
        if(advertisement==true)
        {
            Human cus = humans[rnd];
            Human cus = humans[rnd];
            System.out.println(cus);
            System.out.println(cus);
        }*/
        Scanner in = new Scanner(System.in);
        int b = in.nextInt();
        if(b==1)
        {
            return cus;
        }
        else if (b==2)
        {
            return cus1;
        }
        /*else if(b==2)
        {
            cus2==humans[1];
        }
        else if(b==3)
        {
            cus3==humans[2];
        }*/
        else
        {
            System.out.println("Wrong choice!");
            Sixth.getRandomClient(humans);
        }
        return null;
    }
}
