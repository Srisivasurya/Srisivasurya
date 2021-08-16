package Collection;

import java.util.PriorityQueue;
class PQ3 {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq1 = new PriorityQueue<Integer>();
        pq1.add(10);
        pq1.add(20);
        pq1.add(30);
        pq1.add(40);
        pq1.add(50);
        pq1.add(60);
        pq1.add(70);
        pq1.add(80);
        pq1.add(90);
        System.out.println("Original Priority Queue: "+pq1);
        System.out.println("The first element of the Queue: "+pq1.peek());
    }
}
