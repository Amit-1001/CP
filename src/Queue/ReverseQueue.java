package Queue;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class ReverseQueue {
    static Queue<Integer> q1;
    static Stack<Integer> st;

    ReverseQueue(){
        q1 = new ArrayDeque<>();
        st = new Stack<>();
    }

    public  static  void reverse(){


        if(q1.isEmpty()){
            return;
        }
       // System.out.println(q1.size());
        for(int i = 0 ; i< q1.size() ;i++){
           int data = q1.remove();
           // you can use element(), peek() as well
           st.push(data);
           //q1.remove();
        }

        for(int i =0 ; i<=st.size();i++){
            q1.add(st.pop());
        }

    }




    public static void main(String[] args) {
        ReverseQueue queueObj  = new ReverseQueue();
        q1.add(10);
        q1.add(20);
        q1.add(30);
        q1.add(40);

        // System.out.println(q1.remove()); // remover pop first element and remove it same time
       // System.out.println(q1.peek()); // peek the first element of array

        System.out.println("Before Reverse:"+q1.toString());
        reverse();
        System.out.println("After Reverse:"+q1.toString());

    }
}
