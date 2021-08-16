package Testans;

import java.util.*;

class Arrilt {

    public static void main(String[] args)
    {

        ArrayList<String> name = new ArrayList<>();

        name.add("Ram");
        name.add("Krishna");
        name.add("Samuel");
        name.add("Muhammad");

        System.out.println("The list is: \n" + name);

        Iterator<String> iter = name.iterator();

        System.out.println("\nThe iterator values" + " of list are: ");
        while (iter.hasNext())
        {
            System.out.print(iter.next() + " ");
        }
    }
}