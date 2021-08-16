package Test;

import java.util.*;

public class Hashmap {

    public static void main(String[] args)
    {
        HashMap<Integer, String> mad1 = new HashMap<>();
        mad1.put(1, "One");
        mad1.put(2, "Two");
        mad1.put(3, "Three");
        HashMap<Integer, String> mad2 = new HashMap<>();
        mad2.put(1, "Modi");
        mad2.put(2, "Trump");
        mad2.put(3, "Biden");
        System.out.println("HashMap1: " + mad1.toString());
        System.out.println("HashMap2: " + mad2.toString());
        mad2.forEach((key, value) -> mad1.merge(key, value, (   v1, v2) -> v1.equalsIgnoreCase(v2) ? v1 : v1 + ", " + v2));
        System.out.println("New HashMap: " + mad1);
    }
}
