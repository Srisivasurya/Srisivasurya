import java.io.*;
import java.util.ArrayList;

class dug3 {
    public static void main(String[] args)
    {
        ArrayList<Integer> dug = new ArrayList<>();
        dug.add(10);
        dug.add(21);
        dug.add(22);
        dug.add(35);
        ArrayList<Integer> dug2 = dug;
        System.out.println("-----Iterating over the second ArrayList----");
        for (Integer value : dug2) {
            System.out.println(value);
        }
        dug2.set(2, 23);
        System.out.println("third element of first list =" + dug.get(2));
        System.out.println("third element of second list =" + dug2.get(2));
    }
}