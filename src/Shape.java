abstract class Area {
    String name = "";

    Area(String num) {
        name = num;
    }f

    abstract int getArea();
}

class Rectangle extends Area {
    int length = 0;
    int width = 0;

    Rectangle(String num, int l, int w) {
        super(num);
        length = l;
        width = w;
    }

    int getArea() {
        return length*width;
    }
}

class Circle extends Area {
    int radius = 0;

    Circle(String num, int r) {
        super(num);
        radius = r;
    }

    int getArea() {
        return (int) (3.14*radius*radius);
    }
}

public class Main {
    public static void main(String args[]) {
        Rectangle obj = new Rectangle("Rectangle", 1, 2);
        System.out.println( obj.name );
        System.out.println( obj.getArea() );

        Circle obj1 = new Circle( "Circle", 2 );
        System.out.println( obj1.name );
        System.out.println( obj1.getArea() );
    }
}