import java.util.concurrent.*;
import java.util.*;

class Add  {
    public static void main(String[] args)
    {

        HashMap<String, Integer> wordCount = new HashMap<>();
        wordCount.put("Geeks", 1);
        wordCount.put("for", 2);
        wordCount.put("geeks", 3);
        System.out.println("Hashmap before operation :\n " + wordCount);
        wordCount.computeIfPresent("Geek", (key, val) -> val + 100);
        System.out.println("HashMap after operation :\n " + wordCount);
    }
}