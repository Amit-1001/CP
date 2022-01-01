package Queue;

import java.util.Collections;
import java.util.Iterator;
import java.util.PriorityQueue;

public class priorityQueue {
    public static void main(String[] args) {
        // By default in java PriorityQueue implements minheap implementation
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // to implement Maxheap we have to use comparator

        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        queue.add(5);
        queue.add(20);
        queue.add(10);
        queue.add(1);
        queue.add(30);



        pq.add(5);
        pq.add(20);
        pq.add(10);
        pq.add(1);
        pq.add(30);


        Iterator value  = pq.iterator();
        System.out.println("Minheap:");
        while (value.hasNext()){
            System.out.print(value.next()+" ");
        }

        Iterator val  = queue.iterator();
        System.out.println("\nMaxheap:");
        while (val.hasNext()){
            System.out.print(val.next()+" ");
        }

    }
}
