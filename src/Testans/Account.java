package Testans;

class Account
{
   double balance;
    public void deposit(double amt)
    {
        balance+=amt;
        System.out.println(balance);
    }
    public void withdraw(double amt) throws InSufficientFundException
    {
        if(amt<=balance)
        {
            balance-=amt;
            System.out.println(balance);
        }
        else
        {
            double need=amt-balance;
            throw new InSufficientFundException(need);
        }
    }

}
