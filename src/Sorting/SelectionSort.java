package Sorting;

import java.util.Arrays;

public class SelectionSort {

    public static int maxIndex(int[] arr,int start,int last){
        int maxIndex = 0;
        for (int i = start ; i<= last;i++){
            if(arr[i]>arr[maxIndex]){
                maxIndex = i; // storing max element index
            }
        }
        return maxIndex;
    }

    public static void swapEle(int []arr,int maxEle,int lastEle){
        int temp = arr[maxEle];
        arr[maxEle] = arr[lastEle];
        arr[lastEle] = temp;
    }

    public  static void selectionSort(int[] arr){
        int last;
        for(int i = 0 ; i<arr.length;i++){
            last = arr.length-i-1; // this is will crate last as each incremented loop where array is getting sort
            // it will not sort till end;
            //when i = 0 : last = arr.length-0-1 = 6;
            // when i =0 : last = arr.length-1-1 = 5;
            // when i =0 : last = arr.length-2-1 = 4;
            //  .
            //  .
            int maxIndex = maxIndex(arr,0,last); // this will find max in remaining array
            swapEle(arr,maxIndex,last); // swap max element with last index
        }

    }


    public static void main(String[] args) {
        int[]  arr = {4,5,1,3,2};

        selectionSort(arr);
        System.out.println(Arrays.toString(arr));

    }
// another method of selection sort this find minimum index s
    static void selSort( int [] arr ){
        int n = arr.length;

        for(int i = 0; i < n; i++){
            int min_Index = i;
            for(int j =i+1; j<n ; j++){
                if(arr[j]<arr[min_Index]){
                    min_Index = j;
                }


            }

            swapEle(arr,min_Index,i);

        }
    }
}
