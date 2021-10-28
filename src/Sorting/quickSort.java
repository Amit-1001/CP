package Sorting;

import java.util.Arrays;

public class quickSort {
    static void swap(int arr[], int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    static int partition(int[] arr, int start, int end){

        int i = start-1;
        int j ;
        int pivot = arr[end];

        for( j = start; j<=end;j++){
            if(arr[j]<pivot){
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr,i+1,end); // i keeps track of smaller element window
        // here we are placing pivot at its right place
        return (i+1); // i + 1 will be position of pivot element after swaping
    }


    static void qSort(int[] arr, int start, int end){
       if(start<end){
           int pivot_index = partition(arr,start,end); // partition will divide array with respect pivot element

           // excluding pivot we sort remaining elements
           qSort(arr,start,pivot_index-1); // left side of array will be sorted
           qSort(arr,pivot_index+1,end); // right side of array will be sorted
       }
    }

    public static void main(String[] args) {
        int[] arr = {24,18,38,43,14,40,1,54};
        int start = 0;
        int end = arr.length-1;

        qSort(arr,start,end);

        System.out.println(Arrays.toString(arr));



    }
}
