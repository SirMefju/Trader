package com.company;
public class AutoBot
{
    public String firstName;
    public static Double cash=10.0;
    public static Car[] garage;
    public static String[] usedCars;

    public AutoBot(String firstName,Double cash, Integer garageSize)
    {
        this.firstName = firstName;
        AutoBot.cash = cash;
        garage = new Car[garageSize];
    }

    public static void botGarage()
    {
        garage = new Car[25];
        garage[0] = new Car("Mercedes1", "S", 150000.0, 35000.0,"White","breaks");
        garage[1] = new Car("Mercedes2", "S", 150000.0, 35000.0,"White","breaks");
        garage[2] = new Car("Mercedes3", "S", 150000.0, 35000.0,"White","breaks");
        garage[3] = new Car("Mercedes4", "S", 150000.0, 35000.0,"White","breaks");
        garage[4] = new Car("Mercedes5", "S", 150000.0, 35000.0,"White","breaks");
        garage[5] = new Car("Mercedes6", "S", 150000.0, 35000.0,"White","breaks");
        garage[6] = new Car("Mercedes7", "S", 150000.0, 35000.0,"White","breaks");
        garage[7] = new Car("Mercedes8", "S", 150000.0, 35000.0,"White","breaks");
        garage[8] = new Car("Mercedes9", "S", 150000.0, 35000.0,"White","breaks");
        garage[9] = new Car("Mercedes10", "S", 150000.0, 35000.0,"White","breaks");
        garage[10] = new Car("Mercedes11", "S", 150000.0, 35000.0,"White","breaks");
        garage[11] = new Car("Mercedes12", "S", 150000.0, 35000.0,"White","breaks");
        garage[12] = new Car("Mercedes13", "S", 150000.0, 35000.0,"White","breaks");
        garage[13] = new Car("Mercedes14", "S", 150000.0, 35000.0,"White","breaks");
        garage[14] = new Car("Mercedes14", "S", 150000.0, 35000.0,"White","breaks");
        garage[15] = new Car("Mercedes15", "S", 150000.0, 35000.0,"White","breaks");
        garage[16] = new Car("Mercedes16", "S", 150000.0, 35000.0,"White","breaks");
        garage[17] = new Car("Mercedes17", "S", 150000.0, 35000.0,"White","breaks");
        garage[18] = new Car("Mercedes18", "S", 150000.0, 35000.0,"White","breaks");
        garage[19] = new Car("Mercedes19", "S", 150000.0, 35000.0,"White","breaks");
        garage[20] = new Car("Mercedes20", "S", 150000.0, 35000.0,"White","breaks");
        garage[21] = new Car("Mercedes21", "S", 150000.0, 35000.0,"White","breaks");
        garage[22] = new Car("Mercedes22", "S", 150000.0, 35000.0,"White","breaks");
        garage[23] = new Car("Mercedes23", "S", 150000.0, 35000.0,"White","breaks");
        garage[24] = new Car("Mercedes24", "S", 150000.0, 35000.0,"White","breaks");
    }
    public static void setCar(Car car, int index)
    {
        garage[index] = car;
    }
    public static int findInGarage(Car car)
    {
        for (int i = 0; i < garage.length; i++)
        {
            if (garage[i] == car) return i;
        }
        return -1;
    }
}
