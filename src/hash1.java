import java.util.*;

public class hash1{
    public static void main(String args[])
    {
        HashSet<String> set = new HashSet<String>();
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("D");
        set.add("F");
        System.out.println("HashSet: " + set);
        set.clear();
        System.out.println("The final set: " + set);
    }
}

