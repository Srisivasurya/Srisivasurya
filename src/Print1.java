class Print1
{
    int num;
    String name;
    Print1()
    {
        System.out.println("Constructor called");
    }
}

class Display1
{
    public static void main (String[] args)
    {
        Print1 p1 = new Print1();
        System.out.println(p1.name);
        System.out.println(p1.num);
    }
}
