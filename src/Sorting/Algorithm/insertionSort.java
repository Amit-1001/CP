package Sorting.Algorithm;

import java.util.Arrays;

public class insertionSort {
    public static void swap(int[] arr,int a , int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {5,1,3,4,2};
        // 1 2 3 4 5

        for(int i = 0 ; i < arr.length-1 ; i++){ // no need to loop till last element as j is depends on i which is j = i+1
            for(int j = i + 1; j >0 ; j--){ // its is taking subset of array and sorting it

                if(arr[j-1]>arr[j]){ // checking if previous element is greater if its greater swap it.
                    swap(arr,j,j-1);
                }
                else {
                    break; // no need to swap if j > j-1;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
