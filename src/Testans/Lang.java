package Testans;

interface Language
{
    void printName(String a);
}
class IndianLanguage implements Language{


    public void printName(String a)
    {
        System.out.println("my language is "+a);
    }

    public static void main(String[] args)
    {
        IndianLanguage p=new IndianLanguage();

        p.printName("Tamil");
    }
}
