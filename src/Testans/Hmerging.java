package Testans;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Hmerging
{
    public static void main(String args[])
    {
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1, "One");
        map1.put(2, "Two");
        map1.put(3, "Three");

        Map<String, String> map2 = new HashMap<>();
        map2.put("One", "Modi");
        map2.put("Two", "Trump");
        map2.put("Three", "Biden");
        Set se = map1.keySet();
        Iterator iter = se.iterator();
        while(iter.hasNext())
        {
            Integer i= (Integer) iter.next();
            System.out.println(i +" "+  map1.get(i)  +" "+ map2.get(map1.get(i)) );
        }
    }
}

