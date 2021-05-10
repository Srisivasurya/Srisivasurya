class calc
{
    int no1, no2;

    calc(int a, int b)
    {
      this.no1 = a;
      this.no2 = b;
    }
    public void sum()
    {
        System.out.println("Sum of "+no1+" and "+no2+" is "+(no1+no2));
    }
}

class add
{
    public static void main(String args[])
    {
        calc c = new calc(30, 10);
        c.sum();
    }
}
