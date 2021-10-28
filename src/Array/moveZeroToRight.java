package Array;

import java.util.Arrays;

public class moveZeroToRight {
    static void swap(int[] arr,int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void main(String[] args) {
        int[] arr ={10,20,13,0,0,0,15};
        int count =0 ; // this will keep count of distinct element

        for(int i= 0; i< arr.length; i++){
            if( arr[i]!=0){// i 0 encountered ignore
                swap(arr,i,count);// if distinct or same element are found swap;
                count++;
            }// if zero encounter it will skip count and find next element which is not zero and will swap with previous count(last distinct element position)
        }


        System.out.println(Arrays.toString(arr));
    }
}
