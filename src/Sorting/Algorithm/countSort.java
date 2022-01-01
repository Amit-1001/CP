package Sorting.Algorithm;

import java.util.Arrays;

public class countSort {
    public static void main(String[] args) {
        int[] arr ={1,3,4,5,1,1,2,4};
        int min =0;
        int max =0;

        for(int i =0; i< arr.length; i++){
            min = Math.min(arr[i],min);

            max = Math.max(max,arr[i]);
        }

        sortCount(arr,min,max);

        System.out.println(Arrays.toString(arr));

    }

     static void sortCount(int[] arr, int min, int max) {
        int range = max - min + 1; // + 1 is important

        int[] count  = new int[range]; // count frequency of element in array

         Arrays.fill(count,0);

         for(int i =0 ;i<arr.length;i++){
                int index = arr[i] - min; // finding is element position

                count[index]++; // increasing count of repeated element in array

         }

         for(int i=1; i<count.length;i++){
             count[i]  = count[i] + count[i-1]; // finding the prefix sum of frequency
         }

         int[] ans = new int[arr.length];

         for(int i =arr.length-1; i>=0 ;i--){
             int val = arr[i];
             int pos  = count[val - min]; // finding pos of val in count array
             int index = pos -1; // now index of pos is placed in ans at index position

             ans[index] = val;

             count[val-min]--; // decreasing frequency causes we have stored one value from count in array ans
         }

         for(int i =0; i< arr.length; i++){
             arr[i]= ans[i];
         }


    }
}
