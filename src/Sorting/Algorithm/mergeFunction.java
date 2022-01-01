package Sorting.Algorithm;

import java.util.Arrays;

public class mergeFunction {
    static void merge(int[] arr,int start , int mid, int end){

        int size_Of_leftArray = mid-start+1;
        int size_Of_rightArray = end-mid;

        int[] left = new int[size_Of_leftArray];// this store left side element of array
        int[] right = new int[size_Of_rightArray]; // this store right side of element of array

        for (int i = 0; i<size_Of_leftArray;i++){
            left[i]  = arr[start+i];// here start is important
        }

        for (int j=0 ; j<size_Of_rightArray;j++){
            right[j] = arr[mid+1+j];
        }

        //same logic of mergeSort

        int i =0,k=0,j=0;
        // as we want to store result in given array we have to use k to keep track of index of array

        while (i<size_Of_leftArray && j <size_Of_rightArray){ // m n
            if(left[i]<=right[j]){ // if left element is small store it in array
                arr[k] = left[i];
                k++;
                i++;

            }
            else { // is right side element is small store it in array
                arr[k++] = right[j++];

            }
        }

        while (i<size_Of_leftArray){
            arr[k++] = left[i++];

        }

        while (j<size_Of_rightArray){
            arr[k++] = right[j++];

        }
    }


    public static void main(String[] args) {
        int[] arr ={10,15,20,40,8,11,50};// half of element of array are sorted



        //sort and merge two array;
        // these there thing are given
        int start   =0;
        int end = 6;
        int mid = 3;


        merge(arr,start,mid,end);

        System.out.println("After Merge");

        System.out.print(Arrays.toString(arr));
    }


}
