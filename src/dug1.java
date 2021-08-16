import java.util.*;
class dug1 {
    public static void main(String[] args)
    {
        HashMap<Integer, String> hash_map = new HashMap<Integer, String>();
        hash_map.put(10, "sri");
        hash_map.put(15, "siva");
        hash_map.put(20, "surya");
        hash_map.put(25, "G");
        hash_map.put(30, "D");
        System.out.println("Initial Mappings are: " + hash_map);
        System.out.println("The set is: " + hash_map.keySet());
    }
}