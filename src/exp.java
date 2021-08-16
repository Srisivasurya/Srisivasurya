/*import java.lang.Throwable;
class InvalidProductException extends Exception
{
    public InvalidProductException(String s)
    {
        super(s);
    }
}

public class Exp
{
    void productCheck(int weight) throws InvalidProductException{
        if(weight<100){
            throw new InvalidProductException("Product Invalid");
        }
    }

    public static void main(String args[])
    {
        Exp obj = new Exp();
        try
        {
            obj.productCheck(60);
        }
        catch (InvalidProductException ex)
        {
            System.out.println("Caught the exception");
            System.out.println(ex.getMessage());
        }
    }
}*/