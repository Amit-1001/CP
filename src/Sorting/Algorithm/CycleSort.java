package Sorting.Algorithm;

import java.util.Arrays;

public class CycleSort {
    public static void main(String[] args) {
        int [] arr = {3,1,4,5,2,2};

        //1,2,3,4,5     0,1,2,3,4  3,1,2,0,4
        //0,1,2,3,4

        //4,1,3,5,2
        //5,1,3,4,2
        //2,1,3,4,5
        //1,2,3,4,5


        cycleSort(arr);

        for(int i =0; i< arr.length; i++){
            if(i+1 != arr[i]  ){
                System.out.println("Duplicate:"+arr[i]);
            }
        }


        System.out.println(Arrays.toString(arr));
    }

    public  static  void cycleSort(int[]arr){
        int i=0;

        while (i<arr.length){
            int correct_index =arr[i]-1; // if array started from 1



            if(arr[i]!=arr[correct_index]){
                swap(arr,i,correct_index);
            }
            else {
                i++;
            }
        }
    }

    public static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a]  = arr[b];
        arr[b] = temp;
    }
}
