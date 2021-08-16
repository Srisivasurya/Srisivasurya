package Collection;

import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
class CList2 {
    public static void main(String[] args) {
        ArrayList<String> c1= new ArrayList<String>(3);
        c1.add("Car");
        c1.add("Model");
        c1.add("Year");
        System.out.println("Original array list: " + c1);
        c1.ensureCapacity(6);
        c1.add("Audi");
        c1.add("S");
        c1.add("2021");
        System.out.println("New array list: " + c1);
    }
}

