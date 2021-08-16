class stat1 {
    static int a = m1();
    static
    {
        System.out.println("static block");
    }
    static int m1()
    {
        System.out.println("from m1");
        return 50;
    }
    public static void main(String[] args)
    {
        System.out.println("Value of a : " + a);
        System.out.println("from main");
    }
}