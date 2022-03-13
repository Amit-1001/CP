package stack.hard;

import java.util.Arrays;
import java.util.Stack;

public class Largest_Rectangle_In_Histogram {
    public static int[] findSmallOnRight(int[] heights){
        int n = heights.length;

        Stack<Integer> st = new Stack<>();

        int[] res = new int[n];

        Arrays.fill(res,n); // when we find next greater or next smaller in right we fill array with size of array

        for(int i=0; i<n; i++){
            while(st.size()>0 && heights[st.peek()] > heights[i] ){
                int idx = st.pop();
                res[idx] = i;
            }
            st.push(i);
        }

        return res;
    }


    public static int[] findSmallOnLeft(int[] heights){
        int n = heights.length;
        Stack<Integer> st = new Stack<>();

        int[] res = new int[n];

        Arrays.fill(res,-1);// when we find next greater or next smaller in left we fill array with -1

        for(int i=n-1; i>=0; i--){
            while(st.size()>0 && heights[st.peek()] > heights[i]){
                int idx = st.pop();
                res[idx] = i;
            }
            st.push(i);
        }

        return res;
    }


    public static int largestRectangleArea(int[] heights) {
        int n = heights.length;

        int[] nsor = findSmallOnRight(heights); //finding next smaller on right
        int[] nsol = findSmallOnLeft(heights); // finding next smaller on left

        int[] width = new int[n];


        // to find width use nsor[i] - (nsol[i]) - 1
        for(int i=0; i<n ; i++){
            width[i] = nsor[i] - (nsol[i]) - 1;
        }


        // Calculate max Area of rectangle
        int max =0;
        for(int i=0; i<n; i++){
            max = Math.max(max, heights[i] * width[i]);
        }

        return max;

    }

    public static void main(String[] args) {
        int[] heights = {2,1,5,6,2,3};
        // Ans is 10

        int ans = largestRectangleArea(heights);

        System.out.println("Largest Area : "+ ans);
    }
}
