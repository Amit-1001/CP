package stack;

import java.util.Stack;

public class previousGreater {
    public static void main(String[] args) {
        int[] arr = {15,10,18,12,4,6,2,8};
        Stack<Integer> st = new Stack<>();
        st.push(0); // storing first index of array in stack
        System.out.print(-1); // printing first element as -1 cause there no element in left side

        for(int i =1; i< arr.length; i++){
            while (st.isEmpty()==false && arr[st.peek()]<arr[i]){ // while stack is not empty and
                // st.peek() has position of  element which is greater in left side we check whether current element is greater
                // if current element greater pop all element from stack
                st.pop();
            }
            int ele  = (st.isEmpty())? -1: arr[st.peek()]; // when stack is empty which means there no greater element on left side
            // put -1 in ele and if stack is not empty which means there is greater element in left side of current element
            System.out.print(" "+ele);
            st.push(i); // pushing new element to stack
        }
    }
}
