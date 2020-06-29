package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        System.out.println("Welcome in Trader game!\nTell me your name.");
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        Player me = new Player(a,1000000.0,5);
        AutoBot bot = new AutoBot("bot", 10000.0);
        Human[] humans = new Human[5];
        humans[0] = new Human("Henry",500000.0,5);
        humans[1] = new Human("Joseph",500000.0,5);
        humans[2] = new Human("Ryszard",500000.0,5);
        humans[3] = new Human("Lionel",500000.0,5);
        humans[4] = new Human("Olgierd",500000.0,5);
        System.out.println("Hello "+a+", at the start you have: "+ me.cash +"$!");
        Menu.choose(me,bot,humans);
    }
}
