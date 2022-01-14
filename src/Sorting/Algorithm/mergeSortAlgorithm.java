package Sorting.Algorithm;

import java.util.Arrays;

public class mergeSortAlgorithm {
    public static void main (String[] args)
    {
        int arr[] = new int[]{10,5,30,15,7};
        int start=0,end=4;

        mergeSort(arr,start,end);

        System.out.println(Arrays.toString(arr));
    }

    static void merge(int arr[], int start, int mid, int end){

        int n1=mid-start+1, n2=end-mid; // size of left array and size of right array

        int[] left=new int[n1];
        int[] right=new int[n2];

        for(int i=0;i<n1;i++)
            left[i]=arr[i+start];

        for(int j=0;j<n2;j++)
            right[j]=arr[mid+1+j];

        int i=0,j=0,k=start; // k always should initialize  to start as start is changing every time

        while(i<n1 && j<n2){
            if(left[i]<=right[j])
                arr[k++]=left[i++];
            else
                arr[k++]=right[j++];
        }
        while(i<n1)
            arr[k++]=left[i++];
        while(j<n2)
            arr[k++]=right[j++];


    }

    static void mergeSort(int arr[],int start,int end){
        if(end>start){ //  checking if there is at least two element

            int mid=start+(end-start)/2;
            mergeSort(arr,start,mid);
            mergeSort(arr,mid+1,end);
           merge(arr,start,mid,end);
        }


    }






}
