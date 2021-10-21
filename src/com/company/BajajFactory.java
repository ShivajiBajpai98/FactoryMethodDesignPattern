package com.company;
import test.problem.ChennaiCustomer;
import test.problem.HyderabadCustomer;
public abstract class BajajFactory {
    public static void paint()
    {
    }

    public static void assemble()
    {
    }

    public static  void test() {

    }

    public abstract Bike createBike(String type);
    public Bike orderBike(String type)
    {
        Bike bike = null;
        bike = createBike(type);
        paint();
        assemble();
        test();
        return bike;


    }
}