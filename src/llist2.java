import java.util.*;

class list {
    public static void main(String[] args) {
        LinkedList <String> c1 = new LinkedList <String> ();
        c1.add("Car");
        c1.add("Truck");
        c1.add("Bus");
        c1.add("Tain");
        c1.add("Auto");
        System.out.println("Original linked list: " + c1);
        String x = c1.peekFirst();
        System.out.println("First element in the list: " + x);
        System.out.println("Original linked list: " + c1);
    }
}