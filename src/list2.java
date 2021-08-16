import java.io.*;
import java.util.ArrayList;

class list2 {
    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(21);
        list.add(22);
        list.add(35);

        ArrayList<Integer> list2 = list;
        System.out.println("-----Iterating over the second ArrayList----");
        for (Integer value : list2) {
            System.out.println(value);
        }


        System.out.println("third element of first list =" + list.get(2));
        System.out.println("third element of second list =" + list2.get(2));
    }
}