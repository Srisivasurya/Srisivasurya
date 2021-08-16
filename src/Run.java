class Ant
{
    public void print()
    {
        System.out.println("Iam in class A");
    }
}

class Bee extends Ant
{
    public void print()
    {
        System.out.println("Iam in class B");
    }
}

class Run
{
    public static void main(String[] args)
    {
        Ant a = new Ant();
        a.print();

        Ant b = new Bee();
        b.print();
    }
}