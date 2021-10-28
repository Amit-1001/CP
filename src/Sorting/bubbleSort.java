package Sorting;

import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int[] arr ={5,4,2,3,1};
        boolean swapped; // this will check whether array is sorted or not .

        for (int i = 0; i < arr.length; i++) {
            swapped = false;

            for (int j = 1; j <arr.length-i; j++) { // arr.length-i will not loop till  end as previous sort already sorted the array
                if(arr[j]<arr[j-1]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                    swapped = true;
                }

            }
            if(!swapped){
                break; // if swapped not happens it will break as it suggest array is already sorted
            }

        }

        System.out.println(Arrays.toString(arr));
    }
}
