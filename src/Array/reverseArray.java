package Array;

import java.util.Arrays;

public class reverseArray {

    public static void swap(int arr[],int a,int b){
        int temp;
        temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;

    }

    public static void main(String[] args){
        int [] arr = {1,2,3,4,5};

        int len = arr.length;

        int start = 1;
        int end = len-2;

        swap(arr,0,len-1);// this swap first and last element with each other
        while(start<end){

            swap(arr,start,end);
            start++;
            end--;

        }


        System.out.println(Arrays.toString(arr));



    }
}
