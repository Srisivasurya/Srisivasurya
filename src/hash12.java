import java.util.*;

class name {

    public static void main(String[] args)
    {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(10, "Amar");
        map.put(20, "Surya");
        map.put(30, "Harish");
        System.out.println("HashMap:\n" + map.toString());
        map.computeIfAbsent(40, k -> "Sanjay");
        map.computeIfAbsent(10, k -> "Giri");
        System.out.println("New HashMap:\n" + map);
    }
}