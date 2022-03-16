package stack.medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class nextSmallerElement {
    public static void main(String[] args) {
        int[] arr = {5,15,10,8,6,12,9,18};

        ArrayList<Integer> list = new ArrayList<>();
        Stack<Integer> st = new Stack<>();
        st.add(arr.length-1);
        list.add(-1);

        for(int i = arr.length-2; i>=0; i--){

            while (st.isEmpty()==false && arr[st.peek()]>= arr[i]){
                st.pop();
            }

            int ele = (st.isEmpty())? -1 : arr[st.peek()];

            list.add(ele);
            st.add(i);
        }
        Collections.reverse(list);
        System.out.print(list.toString());
    }
}
