public class Compare
{
    public static void main(String[] args)
    {
        int Var1 = 55;
        int Var2 = 75;
        double Var3 = 19.6;
        double Var4 = 18.3;
        int result1 = minFunction(Var1, Var2);
        double result2 = minFunction(Var3, Var4);
        System.out.println("The minimum value of integer types = " + result1);
        System.out.println("The minimum value of double types = " + result2);
    }

    public static int minFunction(int n1, int n2)
    {
        int min;
        if (n1 > n2)
            min = n2;
        else
            min = n1;
        return min;
    }

    public static double minFunction(double n1, double n2)
    {
        double min;
        if (n1 > n2)
            min = n2;
        else
            min = n1;
        return min;
    }
}