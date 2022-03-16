package stack.medium;

import java.util.Stack;

public class previousSmaller {
    public static void main(String[] args) {
        int[] arr = {15,10,18,12,4,6,2,8};
        Stack<Integer> st = new Stack<>();

        st.add(0);

        for(int i=1; i<arr.length; i++){
            while (st.isEmpty()==false && arr[st.peek()]>= arr[i]){
                st.pop();
            }

            int ele = (st.isEmpty())? -1: arr[st.peek()];
            System.out.print(" "+ele);
            st.add(i);
        }
    }
}
