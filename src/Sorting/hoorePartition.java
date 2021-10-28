package Sorting;

import java.lang.reflect.Array;
import java.util.Arrays;

public class hoorePartition {
    static void swap(int [] arr , int a, int b){
        int temp = arr[a];
        arr[a]  = arr[b];
        arr[b] = temp;
    }

    static int hoore_partition(int [] arr, int start , int end){
        int i = start-1;
        int j = end;
        int pivot = arr[start];

        while (true){
            do{
                i++;
            }while (arr[i]<pivot);

            do {
                j--;
            }while (arr[j]>pivot);

            if(i>=j){
                return j;

                //System.exit(0);
            }
            swap(arr,i,j);
        }

    }

    public static void main(String[] args) {
        int [] arr = {5,3,8,4,2,7,1,10};

        int start = 0;
        int end = arr.length;

        int res = hoore_partition(arr,start,end);

        System.out.println(Arrays.toString(arr));
    }
}
