package com.company.options;
import com.company.AutoBot;
public class First
{
    public static void first(AutoBot bot)
        {
            System.out.println("Available cars for you:");
            for(int i = 0; i< bot.garage.length; i++)
            {
                System.out.println(bot.garage[i]);
            }
        }
}
