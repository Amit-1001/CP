package stack;

import java.util.*;

import static java.util.Collections.reverse;

public class nextGreaterElement {

    public static void main(String[] args) {
        int[] arr = {5,15,10,8,6,12,9,18};

        ArrayList<Integer> list = new ArrayList<>();// we need extra array list because we are traversing array from end
        // so desire output would be reverser of ArrayList

        Stack<Integer> st = new Stack<>();
        st.push(arr[arr.length-1]);// pushing last element in stack
        list.add(-1);

        for(int i= arr.length-2;i>=0;i--){ // to find next greater element we traverse through end of array

            while (st.empty()==false && st.peek()<= arr[i]){ // checking if current element is greater than element present at top
                // if current element is greater we have to pop all element from stack
                st.pop();
            }

            int ng=st.isEmpty()?-1:st.peek(); // when stac
            list.add(ng);
            st.add(arr[i]);
        }
        Collections.reverse(list);

        System.out.print(list.toString());

    }
}
