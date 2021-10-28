package Queue;

import java.util.Deque;
import java.util.LinkedList;

public class maxiumOfallSubarrayK {
    public static void main(String[] args) {
        int[] arr = {20,40,30,10,60};

        printMax(arr,3);


    }

    private static void printMax(int[] arr,int k) {
        int n = arr.length;

        Deque<Integer> dq = new LinkedList<>();


        for(int i = 0; i<k; i++){
            while (!dq.isEmpty() && arr[i] >= arr[dq.peekLast()]){
                dq.removeLast();
            }
            dq.addLast(i);
        }

        for (int i =k ; i<n; i++){
            System.out.println(arr[dq.peek()]+" "); // printing is first element of Deque which is max from first sub array

            while (!dq.isEmpty() && dq.peek() <= i-k){ // when element is out of sub array remove is first max from Deque
                dq.removeFirst();
            }

            while (!dq.isEmpty() && arr[i] >= arr[dq.peekLast()]){ // if current element is greater remover max from Deque
                dq.removeLast();
            }
            dq.addLast(i); // when deque is empty add current element index which is max


        }
        System.out.println(arr[dq.peek()]+" ");
    }
}
