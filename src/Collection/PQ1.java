package Collection;
import java.util.*;
import java.util.PriorityQueue;
public class PQ1 {
        public static void main(String[] args) {
            PriorityQueue<String> pq = new PriorityQueue<String>();
            pq.add("Red");
            pq.add("Green");
            pq.add("Orange");
            System.out.println("Elements of the Priority Queue: ");
            for (String element : pq) {
                System.out.println(element);
            }
        }
    }

