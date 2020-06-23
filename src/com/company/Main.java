package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        System.out.println("Welcome in Trader game!\nTell me your name.");
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        Player me = new Player(a,10000000.0,3);
        AutoBot bot = new AutoBot("bot", 100.0,25);
        System.out.println("Hello "+a+", at the start you have: "+ Player.cash +"$!");
        Menu.choose();
    }
}
