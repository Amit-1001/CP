package Sorting;

import java.util.Arrays;

public class sortOneTwoZero {

    // this is Dutch flag algorithm
    static void swap(int[]arr,int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b]  = temp;
    }

    static void sort(int [] arr,int start, int end){
       int low = start;
       int mid = 0;
       int high = arr.length-1;
// low keeps track of 0 mid keeps track of 1 and high keeps track of 2
       while (mid<=high){
           if(arr[mid]==0){ // if we find zero swap with mid position
               swap(arr,low,mid);
               low++;
               mid++;
           }
           else if(arr[mid]==1){ // ignore if 1 found and increment mid
               mid++; //
           }
           else{
               swap(arr,mid,high); // mid = 2 it will swap with middle position
               high--;
           }
       }
// we can even use for loop
//        for(int i = 0; i<=high;){
//            if(arr[i]==0){
//                swap(arr,low,i);
//                i++;
//                low++;
//            }
//            else if(arr[i]==2){
//                swap(arr,high,i);
//                high--;
//            }
//            else {
//                i++;
//            }
//        }


    }

    public static void main(String[] args) {
        int[] arr={1,2,2,2,0,0,1};
        int start = 0;
        int end = arr.length;
        sort(arr,start,end);
        System.out.println(Arrays.toString(arr));
    }
}
