package Sorting;

import java.util.Arrays;

public class quickSort_HoorePartition {
    static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b]  = temp;

    }


    static int partition(int[] arr, int start, int end){
        int i = start-1;
        int j = end+1;
        int pivot = arr[start];
        while (true){
            do{
                i++;
            }while (arr[i]<pivot);

            do {
                j--;
            }while (arr[j]>pivot);

            if(i>=j){
                    return j;
            }
            swap(arr,i,j);
        }
    }


    static void qSort(int[] arr, int start, int end){
        if(start<end){
            int pivot_index = partition(arr,start,end);

            qSort(arr,start,pivot_index);
            qSort(arr,pivot_index+1,end);
        }

    }



    public static void main(String[] args) {
        int [] arr = {1,7,8,2,3,10,4,6,5};
        int start = 0;
        int end = arr.length-1;

        qSort(arr,start,end);

        System.out.println(Arrays.toString(arr));

    }
}
