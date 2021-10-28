package Sorting;

import java.util.Arrays;

public class countSortAlgo {

    public static void main(String[] args) {
        int [] arr ={0,1,1,0,2,4,5,5,3};

        int size = arr.length;

        countSort(arr,size,6);

        System.out.println(Arrays.toString(arr));
    }

     static void countSort(int[] arr, int size,int k) {
        // this is naive solution but its only used for integer it can not use for object sorting
        int [] count = new int[k];
         for(int i=0;i<k;i++)
             count[i]=0;

        for(int i = 0; i<size; i++){
            count[arr[i]] = count[arr[i]] + 1; // incrementing arr[i] element's index occurrence by one
            // arr[i] is being use as index

        }

        int index =0;

        for(int i = 0 ; i<k;i++){
            for(int j = 0 ;j<count[i]; j++){ // count[i] is occurrence printer
                arr[index] =i;
                index++;
            }
        }

    }
}
