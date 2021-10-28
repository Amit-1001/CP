package recurrsion;

import java.util.Arrays;

public class mergeSort {
    public static void main(String[] args) {
        int[] arr = {8,3,4,12,5,6};

        mergeSortFun(arr,0,arr.length);

        System.out.println(Arrays.toString(arr));

    }

    private static void mergeSortFun(int[] arr,int start , int end) {
        if(end - start == 1){
            return;
        }

        int mid = start + (end - start)/2;

         mergeSortFun(arr,start,mid);
         mergeSortFun(arr,mid,end);

         merge(arr,start,mid,end);

    }

    private static void merge(int[] arr, int start,int mid,int end) {
        int i =start;
        int j =mid;
        int k =0;
        int[] res = new int[end-start];

        while (i<mid && j<end){
            if(arr[i]<arr[j]){
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
            res[k++]  = arr[j++];
        }

        for (int l = 0; l < res.length ; l++) {
            arr[start + l] = res [l];
        }

    }
}
