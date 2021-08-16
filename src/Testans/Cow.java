package Testans;

abstract class Animal
{
    public abstract void animalsound();
}
class Cow extends Animal{

    public void animalsound()
    {
        System.out.println("The cow says maa");
    }
    public static void main(String args[])
    {
        Animal obj = new Cow();
        obj.animalsound();
    }
}
