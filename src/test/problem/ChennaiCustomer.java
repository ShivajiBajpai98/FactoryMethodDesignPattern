package test.problem;
import com.company.BajajFactory;
import com.company.Bike;
import com.company.ChennaiFactory;
import com.company.NagpurFactory;


public class ChennaiCustomer
{
    public static void main(String args[])
    {
        Bike bike =null;
        BajajFactory bajajFactory=null;
        bajajFactory = new NagpurFactory();
        bike= bajajFactory.orderBike("Pulsar");
        bike.drive();
    }
}
