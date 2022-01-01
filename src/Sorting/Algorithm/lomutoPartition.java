package Sorting.Algorithm;

import java.util.Arrays;

public class lomutoPartition {
    static void swap(int [] arr,int a , int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b]  = temp;
    }


    static void partition(int[] arr, int start , int end){
        int pivot = arr[end]; // consider last element as pivot
        int i = -1;

        for(int j = start; j<=end ; j++){
            if(arr[j]<pivot){
                i++;
                swap(arr,i,j);
            }
        }

        swap(arr,i+1,end); // i+1 is position pivot element where all left element to this position are smaller
        // above swap required to place pivot at its right position
        System.out.println("Position of Pivot Element:"+(i+1));

    }


    public static void main(String[] args) {
        int [] arr = {1,2,3,7,10,6,5,4,9,8};
        int start = 0;
        int end = arr.length-1;
        partition(arr,start,end);

        System.out.println(Arrays.toString(arr));

    }
}
