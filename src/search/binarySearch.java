package search;

import java.awt.*;
import java.sql.SQLOutput;

public class binarySearch {
    static int binaryS(int [] arr, int target){
        int start = 0;

        int end = arr.length-1;
        //int mid = (start+end)/2; // this is not effective for big array
        int mid; // this is alternative for above method;
        // below logic is used when array is in ascending order
//        while(start<=end){
//            mid = start +(end - start)/2;
//
//            if(target>arr[mid]){
//                start = mid + 1;
//
//            }
//            else if(target< arr[mid]){
//                end = mid -1;
//            }
//            else{
//                return mid;
//            }
//
//        }

        // this logic is used when array is sorted in descending order
        while (start <=end){
            mid = start + (end - start)/2;


            if(target>arr[mid]){
                end = mid -1;
            }
            else if(target<arr[mid]){
                start = mid + 1;
            }
            else{
                return mid;
            }
        }



        return -1;
    }
    public static void main(String[] args){
        int [] arr = { 1,2,3,4,5,6,7,8,9,10}; // Ascending sorted array
        int [] arr2 = {10,9,8,7,6,5,4,3,2,1}; // Descending sorted array

        int target = 2;
        int result = binaryS(arr2,target);
        System.out.println(result);


//




    }
}
