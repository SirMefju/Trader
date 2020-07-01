package com.company.options;

import com.company.Player;

import java.util.Scanner;

public class Twelfth
{
    public static void twelfth(Player me)
    {
        System.out.println("---------------------------------------------------------------------");
        System.out.println("   Regulations:");
        System.out.println("   You have got "+me.cash+"$.");
        System.out.println("   You have to earn twice as much to win a game.");
        System.out.println("   "+me+" do this in as few moves as possible.");
        System.out.println("   Checking account, number of moves and every history aren't a move.");
        System.out.println("   If you buying advertisement, you will have new clients.");
        System.out.println("   Have fun :)");
        System.out.println("---------------------------------------------------------------------");
        System.out.println();
        System.out.println("Press any key to continue..");
        Scanner in = new Scanner(System.in);
        in.next();
    }
}
