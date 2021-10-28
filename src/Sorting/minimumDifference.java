package Sorting;

import java.util.Arrays;

public class minimumDifference {
    static int minDiff(int[] arr){
        int min = Integer.MAX_VALUE;
        int size = arr.length;

        for(int i = 1; i< size; i++){
            min = Math.min(min,arr[i]-arr[i-1]);
        }
        return min;
    }

    public static void main(String[] args) {
        int [] arr = {10,3,20,12};
        Arrays.sort(arr);
        System.out.println("Minimum difference:"+minDiff(arr));
    }
}
