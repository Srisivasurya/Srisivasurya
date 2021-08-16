
abstract class Sum
{
    abstract void calculate(int a, int b);
}
 class Addition extends Sum
{
    void calculate(int a, int b)
    {
        int x = a + b;
        System.out.println(+x);
    }
}
 class Subtraction extends Sum
{
    void calculate(int a, int b)
    {
        int y = a - b;
        System.out.println(+y);
    }
}
 class Multiplication extends Sum
{
    void calculate(int a, int b)
    {
        int z = a * b;
        System.out.println(+z);
    }
}
public class Abt3 {
    public static void main(String[] args) {
        Addition a = new Addition();
        Subtraction s = new Subtraction();
        Multiplication m = new Multiplication();

        a.calculate(20, 30);
        s.calculate(10, 5);
        m.calculate(10, 20);
    }
}