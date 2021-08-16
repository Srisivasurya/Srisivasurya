package Collection;

import java.util.*;

class PQ2 {
    public static void main(String[] args) {


        PriorityQueue<String> pq = new PriorityQueue<String>();
        pq.add("Sri");
        pq.add("Siva");
        pq.add("Surya");
        System.out.println("Original Priority Queue: "+pq);
        List<String> array_list = new ArrayList<String>(pq);
        System.out.println("Array containing all of the elements in the queue: "+array_list);

    }
}
