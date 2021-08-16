import java.util.*;
import java.io.*;

class AddingElementsToHashSet {

    public static void main(String[] args)
    {
        // Instantiate an object
        // of HashSet
        HashSet<String> hs = new HashSet<String>();

        // Elements are added using add() method
        hs.add("Geek");
        hs.add("For");
        hs.add("Geeks");

        // Print the contents on the console
        System.out.println("HashSet elements : " + hs);
    }
}