package com.company;
public class AutoBot
{
    public String firstName;
    public static Double cash=10.0;
    public static Car[] garage;
    public AutoBot(String firstName,Double cash, Integer garageSize)
    {
        this.firstName = firstName;
        AutoBot.cash = cash;
        garage = new Car[garageSize];
    }
    public static void botGarage()
    {
        garage = new Car[25];
        garage[0] = new Car("Mercedes", "S", 130000.0, 55000.0,"White","Premium");
        garage[1] = new Car("Mercedes", "C", 50000.0, 165000.0,"Black","Budget");
        garage[2] = new Car("Mercedes", "E", 70000.0, 125000.0,"Grey","Standard");
        garage[3] = new Car("Mercedes", "GLE", 120000.0, 35000.0,"White","Premium");
        garage[4] = new Car("Mercedes", "G", 150000.0, 45000.0,"Black","Premium");
        garage[5] = new Car("Mercedes", "GT", 190000.0, 5000.0,"Yellow","Premium");
        garage[6] = new Car("Mercedes", "Sprinter", 49000.0, 95000.0,"White","Truck");
        garage[7] = new Car("Mercedes", "Sprinter", 80000.0, 22000.0,"White","Truck");
        garage[8] = new Car("BMW", "1", 30000.0, 170000.0,"White","Budget");
        garage[9] = new Car("BMW", "3", 150000.0, 5000.0,"White","Premium");
        garage[10] = new Car("BMW", "5", 50000.0, 95000.0,"Green","Standard");
        garage[11] = new Car("BMW", "i8", 245000.0, 3000.0,"White","Premium");
        garage[12] = new Car("Audi", "A3", 30000.0, 113000.0,"Black","Budget");
        garage[13] = new Car("Audi", "A8", 150000.0, 5500.0,"Black","Premium");
        garage[14] = new Car("Audi", "TT", 75000.0, 35000.0,"White","Standard");
        garage[15] = new Car("Fiat", "Ducato", 150000.0, 5000.0,"White","Truck");
        garage[16] = new Car("Fiat", "Ducato", 50000.0, 315000.0,"White","Truck");
        garage[17] = new Car("Fiat", "Ducato", 120000.0, 75000.0,"White","Truck");
        garage[18] = new Car("Peugeot", "Partner", 140000.0, 65000.0,"White","Truck");
        garage[19] = new Car("Peugeot", "Partner", 120000.0, 55000.0,"White","Truck");
        garage[20] = new Car("Fiat", "Bravo", 70000.0, 5000.0,"Red","Standard");
        garage[21] = new Car("Opel", "Corsa", 17800.0, 125000.0,"Blue","Budget");
        garage[22] = new Car("Lotus", "Elise", 110000.0, 35000.0,"White","Premium");
        garage[23] = new Car("Mercedes", "S", 150000.0, 35000.0,"White","Premium");
        garage[24] = new Car("BMW", "E46", 20000.0, 235000.0,"Green","Budget");
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
