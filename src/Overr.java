class Parent {
    public void display() {
        System.out.println("parent method is executed");
    }
}
class Child extends Parent {
    public void display() {
        System.out.println("child method is executed");
    }
}
class Overr {
    public static void main(String args[])
    {
        Parent parentObject = new Parent();
        parentObject.display();
        Parent childObject = new Child();
        childObject.display();
    }
}