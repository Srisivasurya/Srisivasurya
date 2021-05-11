class A
{
    protected void display()
    {
        System.out.println("SoftwareTestingHelp");
    }
}

class B extends A {}
class C extends B {}

class Protected1{
    public static void main(String args[])
    {
        B obj = new B();
        obj.display();
        C cObj = new C();
        cObj.display ();
    }
}