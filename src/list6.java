import java.util.ArrayList;

public class list6 {
    public static void main(String[] args)
    {


        ArrayList<Integer> arr = new ArrayList<Integer>(10);
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.trimToSize();
        System.out.println("The List elements are:");

        for (Integer number : arr)
        {
            System.out.println("Number = " + number);
        }
    }
}