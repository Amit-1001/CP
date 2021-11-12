package Queue;

import java.util.*;

public class deque {
    public static void main(String[] args) {
        // Array deque is implement Queue functionality as well
        ArrayDeque<Integer> d = new ArrayDeque<>();
        Stack<Integer> st  = new Stack<>();

        d.add(10); // add is used in QUEUE
        d.add(20);
        Queue<Integer> q = new ArrayDeque<>();
        d.addFirst(5); // these two functionality are of Deque we can add first and last position
        d.addLast(30); // this functionality throw exception
        d.poll(); // remove from first

        System.out.println("First Element is :"+d.getFirst());
        System.out.println("Last element is :"+d.getLast());

        Iterator it = d.descendingIterator(); // using iterator we can traverse arrayDeque


        // ArrayDeque as Deque
        d.offerFirst(2); // This functionality don't throw exceptions
        d.offerLast(40);
        System.out.println( "Peek First:"+d.peekFirst());

        while (it.hasNext()){
            System.out.println(it.next());
        }

    }
}
