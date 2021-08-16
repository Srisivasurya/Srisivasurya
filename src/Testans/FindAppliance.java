package Testans;

public class FindAppliance
{

    double acCost = 25000;
    double fanCost = 1500;
    double lightCost = 250;

    public double findApplianceCost( int ac, int fan, int light )
    {
        double discountAmount = 0;
        double totalAmount = ( acCost * ac + fanCost * fan + lightCost * light );
        if( totalAmount > 25000 )
            discountAmount = ( totalAmount * 5 ) / 100;
        return totalAmount - discountAmount;
    }
}
