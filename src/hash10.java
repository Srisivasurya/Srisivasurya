import java.util.*;

 class help {
    public static void main(String[] args)
    {
        HashMap<Integer, String> map1 = new HashMap<>();
        map1.put(1, "L");
        map1.put(2, "M");
        map1.put(3, "N");
        HashMap<Integer, String> map2 = new HashMap<>();
        map2.put(1, "B");
        map2.put(2, "G");
        map2.put(3, "R");
        System.out.println("HashMap1: " + map1.toString());
        System.out.println("HashMap2: " + map2.toString());
        map2.forEach((key, value) -> map1.merge(key, value, (v1, v2) -> v1.equalsIgnoreCase(v2) ? v1 : v1 + ", " + v2));
        System.out.println("New HashMap: " + map1);
    }
}