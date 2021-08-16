import java.util.Scanner;
abstract class Sha {

    abstract void printArea();

}

class Rectangl extends Sha {
    void printArea() {
        int length, breadth;
        System.out.println("*** Finding the Area of Rectangle ***");
        System.out.print("Enter length and breadth: ");
        Scanner input = new Scanner(System.in);
        length = input.nextInt();
        breadth = input.nextInt();
        System.out.println("The area of Rectangle is: " + length * breadth);
    }
}

class Triangle extends Sha {
    void printArea() {
        int length, breadth;
        System.out.println("\n*** Finding the Area of Triangle ***");
        System.out.print("Enter Base And Height: ");
        Scanner input = new Scanner(System.in);
        length = input.nextInt();
        breadth = input.nextInt();
        System.out.println("The area of Triangle is: " + (length * breadth) / 2);
    }
}

class Cricle extends Sha {
    void printArea() {
        int radius;
        Scanner input = new Scanner(System.in);
        System.out.println("\n*** Finding the Area of Cricle ***");
        System.out.print("Enter Radius: ");
        radius = input.nextInt();
        System.out.println("The area of Cricle is: " + 3.14f * radius * radius);
    }
}

public class Abt {
    public static void main(String[] args) {
        Rectangl rec = new Rectangl();
        rec.printArea();

        Triangle tri = new Triangle();
        tri.printArea();

        Cricle cri = new Cricle();
        cri.printArea();
    }
}