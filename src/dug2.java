import java.util.*;
class dug2 {
    public static void main(String[] args)
    {
        Properties properties = new Properties();
        properties.put("Pen", 10);
        properties.put("Book", 500);
        properties.put("Clothes", 400);
        properties.put("Mobile", 5000);
        System.out.println("Properties: " + properties.toString());
        System.out.println("keySet: " + properties.keySet());
    }
}