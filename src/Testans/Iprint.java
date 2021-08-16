package Testans;

class Aa
{
    public void print()
    {
        System.out.println("I am in class A");
    }
}
class Bb extends Aa
{
    public void print()
    {
        System.out.println("I am in class B");
    }
}
class Iprint
{
    public static void main(String args[])
    {
        Aa a1= new Aa();
        a1.print();

        Aa b1= new Bb();
        b1.print();
    }
}
