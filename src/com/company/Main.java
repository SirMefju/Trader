package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        System.out.println("Welcome in Trader game!\nTell me your name.");
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        System.out.println("Hello "+a+", at the start you have: "+ Player.cash +"$!");
        Menu.choose();
    }
}
