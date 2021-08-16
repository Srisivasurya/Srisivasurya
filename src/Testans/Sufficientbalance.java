package Testans;

class Sufficientbalance
{
    public static void main(String args[])
    {
        Account ab= new Account();
        try
        {
            ab.deposit(10000);
            ab.withdraw(15000);
        }
        catch(InSufficientFundException ife)
        {
            System.out.println("Insufficient fund is"+ ife.error());
        }
    }
}
