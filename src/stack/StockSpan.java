package stack;

import java.util.ArrayList;
import java.util.Stack;

public class StockSpan {
    public static void main(String[] args) {
        int[] arr= {13,15,12,14,16,8,6,4,10,30};

            printSpan(arr);


    }

    private static void printSpan(int[] arr) {
        Stack<Integer> st = new Stack<>();
        st.push(0);
        System.out.print(" "+1);
        int span =0;

        for(int i =1; i<arr.length;i++){
            while(st.isEmpty()==false && arr[st.peek()]<=arr[i]){ // when current stack is not empty
                //arr[st.peek()] this will check top element in stack is smaller than current element are not
                st.pop(); // popping smaller element from stack
            }

            span = st.isEmpty()?i+1 : i-st.peek();

            System.out.print(" "+span);
            st.push(i); // pushing of current element index
        }

    }
}
