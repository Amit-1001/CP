package Queue;

import java.util.ArrayDeque;

public class MaxMinDequeOperation {
    public static ArrayDeque<Integer>  d = new ArrayDeque<>();

    public static void main(String[] args) {


        insertMin(10);
        insertMax(20);

        System.out.println("Min element in Deque:"+getMin());
        System.out.println("Max element in Deque"+getMax());

        insertMax(50);
        insertMin(2);

        System.out.println("Min element in Deque:"+getMin());
        System.out.println("Max element in Deque"+getMax());

        extractMin();
        extractMax();

        System.out.println("Min element in Deque:"+getMin());
        System.out.println("Max element in Deque"+getMax());

    }

    private static int extractMax() {
        return d.pollLast();
    }

    private static int extractMin() {
            return d.pollFirst();
    }

    private static int getMax() {
      return d.peekLast();
    }

    private static int getMin() {

       return d.peekFirst();
    }

    private static void insertMax(int i) {
        d.offerLast(i);
    }

    private static void insertMin(int i) {
        d.offerFirst(i);
    }


}
