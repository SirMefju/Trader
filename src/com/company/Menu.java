package com.company;
import com.company.options.*;
import java.util.Scanner;
public class Menu
{
    public static int menu()
    {
        System.out.println("-----------------------------");
        System.out.println("-         MAIN MENU         -");
        System.out.println("1.   Check available cars.");
        System.out.println("2.   Buy new car.");
        System.out.println("3.   Check your cars.");
        System.out.println("4.   Repair the car.");
        System.out.println("5.   Look at the customers.");
        System.out.println("6.   Sell a car");
        System.out.println("7.   Buy advertisement");
        System.out.println("8.   Check account balance.");
        System.out.println("9.   Check expense history.");
        System.out.println("10.  Check repair history.");
        System.out.println("11.  Check total expenditure.");
        System.out.println("0.   Exit.        ");
        System.out.println("-----------------------------");
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        return x;
    }
    public static void choose()
    {
        int choice = menu();
            if (choice == 1)
            {
                First.first();
                choose();
            }
            else if (choice == 2)
            {
                Second.second();
                choose();
            }
            else if (choice == 3)
            {
                Third.third();
                choose();
            }
            else if (choice == 4)
            {
                Fourth.fourth();
                choose();
            }
            else if (choice == 5)
            {
                Fifth.fifth();
                choose();
            }
            else if (choice == 6)
            {
                Sixth.sixth();
                choose();
            }
            else if (choice == 7)
            {
                Seventh.seventh();
                choose();
            }
            else if (choice == 8)
            {
                Eighth.eighth();
                choose();
            }
            else if (choice == 9)
            {
                Ninth.ninth();
                choose();
            }
            else if (choice == 10)
            {
                Tenth.tenth();
                choose();
            }
            else if (choice == 11)
            {
                Eleventh.eleventh();
                choose();
            }
            else if (choice == 0)
            {
                System.exit(0);
            }
            else
            {
                System.out.println("Wrong choice try again.");
                choose();
            }
    }
}
