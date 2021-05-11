class BaseClass
{
    void display()
    {
        System.out.println("BaseClass::Display with 'default' scope");
    }
}

class Default1
{
    public static void main(String args[])
    {
        BaseClass obj = new BaseClass();

        obj.display();
    }
}