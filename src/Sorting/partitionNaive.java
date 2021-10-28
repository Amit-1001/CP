package Sorting;

import java.util.Arrays;

public class partitionNaive {
    static int partition(int[] arr, int start , int end , int pivot){
        int[] temp = new int[end-start+1];// size of temp array
        int index=0; // keep track of temp index
        for(int i = start; i<=end;i++){
            if(arr[i]<pivot){
                temp[index] = arr[i]; // if element is smaller than pivot element store element in temp
                index++;
            }

        }
        for (int i = start; i<=end; i++){
            if(arr[i]==pivot){ // element equal to pivot
                temp[index++] = arr[i];
            }
        }
        int result = start+index-1; // last pivot position

        for (int i = start; i<=end;i++){
            if(arr[i]>pivot){
                temp[index++] = arr[i];
            }
        }

        // store all element back to main array

        for(int  i =start; i<=end;i++){
            arr[i] = temp[i-start];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr ={1,2,7,8,10,6,5,4,3,9};

        int start = 0;
        int end = arr.length-1;
        int pivot=arr[end];

        // all element left to pivot will be smaller than pivot and all element right to pivot will be greater
        int result = partition(arr,start,end,pivot);

        System.out.println("Position of Last pivot is:"+result);
        System.out.println("Array Element:");
        System.out.println(Arrays.toString(arr));
    }
}
