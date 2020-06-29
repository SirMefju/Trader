package com.company;

public class Human {
    public String firstName;
    public static Double cash = 1000000.0;
    public static Car[] garage;

    public Human(String firstName, Double cash, Integer garageSize) {
        this.firstName = firstName;
        Human.cash = cash;
        garage = new Car[garageSize];
    }

    public static int findFreeSpace()
    {
        for (int i = 0; i < garage.length; i++)
    {
        if (garage[i] == null) return i;
    }
        return -1;
    }

    public void traders()
    {
        Human trader1 = new Human("Mati",1000000.0,2);
        Human trader2 = new Human("Mati",1000000.0,2);
        Human trader3 = new Human("Mati",1000000.0,2);
        Human trader4 = new Human("Mati",1000000.0,2);
        Human trader5 = new Human("Mati",1000000.0,2);
    }
    public static void setCar(Car car, int index)
    {
        garage[index] = car;
    }
}
