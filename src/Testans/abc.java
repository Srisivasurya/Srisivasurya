package Testans;


class A
{
    int sum(int a, int b)
    {
        return a + b;
    }
}
class B extends A
{
    int calculate(int a, int b)
    {
        return (sum(a,b)*100);
    }
}

class Initial
{
    public static void main(String args[])
    {
        B b = new B();
        System.out.println(b.calculate(20, 20));
    }

}

