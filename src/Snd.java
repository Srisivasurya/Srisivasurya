class Animal
{
    public void display()
    {
        System.out.println("I am an animal");
    }
}

class Dog extends Animal
{
    public void display(){
        System.out.println("I am a dog");
    }

    public void printMessage(){
        display();
        super.display();
    }
}

class Snd
{
    public static void main(String[] args)
    {
        Dog dog1 = new Dog();
        dog1.printMessage();
    }
}
