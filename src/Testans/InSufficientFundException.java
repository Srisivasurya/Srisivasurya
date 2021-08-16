package Testans;
import java.lang.*;

class InSufficientFundException extends Exception
{
    double amt;
    public InSufficientFundException(double amt)
    {
        this.amt=amt;
    }
    public double error()
    {
        return amt;
    }
}
