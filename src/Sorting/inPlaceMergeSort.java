package Sorting;

import java.util.Arrays;

public class inPlaceMergeSort {
    public static void main(String[] args) {
        int[] arr =  {10,2,4,15,6,7};

        mergsort(arr,0,arr.length);

        System.out.println(Arrays.toString(arr));
    }

    private static void mergsort(int[] arr, int start, int end) {
        if(end-start==1){ // when only one element is remaining in recursion call then return
            return;
        }

        int mid = start + (end - start)/2; // finding mid of arr

               mergsort(arr,start,mid); // merge sorting first half array till mid
               mergsort(arr,mid,end); // merge sorting second half array till end

               mergeArray(arr,start,mid,end);

    }

    private static void mergeArray(int[] arr, int start, int mid, int end) {
    int[] res = new int[end-start];


    int i =start,j=mid,k=0,e= end;

    while (i<mid && j < end){ // first half and second half
        if(arr[i] < arr[j]){
            res[k] = arr[i++];
        }
        else{
            res[k] = arr[j++];
        }
        k++;
    }

    while (i<mid){
        res[k++] = arr[i++];
    }
    while (j<end){
        res[k++] = arr[j++];
    }

        for (int l = 0; l < res.length; l++) {
            arr[start+l] = res[l];
        }

    }
}
