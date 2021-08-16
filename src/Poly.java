class Multiply
{

    static int Multiply(int a, int b)
    {
        return a * b;
    }

    static double Multiply(double a, double b)
    {
        return a * b;
    }
}

class Poly {
    public static void main(String[] args)
    {

        System.out.println(Multiply.Multiply(5, 6));

        System.out.println(Multiply.Multiply(5.5, 3.3));
    }
}
