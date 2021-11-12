package Queue;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class reverseFirstKOfQueue {

    public static void main(String[] args) {
        Queue<Integer> q = new ArrayDeque<>();

        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.add(60);

        Stack<Integer>st = new Stack<>();
        int k =3;
        for(int i =0; i<k ; i++){
            st.push(q.remove());
        }

        Queue<Integer> res = new ArrayDeque<>();

        while (st.isEmpty() == false){
            res.add(st.pop());
        }

        while (!q.isEmpty()){
            res.add(q.remove());
        }

        while (res.isEmpty()== false){
            System.out.println(res.remove());
        }

    }
}
