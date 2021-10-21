package com.company;

public class NagpurFactory extends BajajFactory
{
    public static void paint()
    {
        System.out.println("Painting bike");

    }
    public static void assemble()
    {
        System.out.println("assembling bike");

    }
    public static void Test()
    {
        System.out.println("Testing bike");

    }
    public  Bike createBike(String type)
    {
        Bike bike = null;
        if (type.equals("Pulsar"))
        {
            bike = new Pulsar();
            System.out.println("Creating pulsar bike");
        }
        else if (type.equals("Discover"))
        {
            bike = new Discover();
            System.out.println("Creating pulsar bike");
        }

            return bike;
    }

}
