package Collection;
import java.util.ArrayList;
import java.util.Collections;
class CList3 {
    public static void main(String[] args) {
        ArrayList<String> c1= new ArrayList<String>();
        c1.add("Surya");
        c1.add("Siva");
        c1.add("Sri");
        c1.add("Go");
        c1.add("Ready");
        System.out.println("Original array list: " + c1);
        System.out.println("Checking the above array list is empty or not! "+c1.isEmpty());
        c1.removeAll(c1);
        System.out.println("Array list after remove all elements "+c1);
        System.out.println("Checking the above array list is empty or not! "+c1.isEmpty());
    }
}

