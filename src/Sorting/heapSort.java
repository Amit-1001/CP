package Sorting;

import java.util.Arrays;

//https://www.youtube.com/watch?v=ywx-Onrdx4U&t=1132s heap data structure
//https://www.youtube.com/watch?v=UVW0NfG_YWA&t=846s heap sort

public class heapSort {
    public static void main(String[] args) {
        // used maxheapify here
        int[] arr = {1,2,84,12};

      sortHeap(arr,arr.length);
        //buildHeap(arr,arr.length);
        System.out.println(Arrays.toString(arr));


    }

    private static void sortHeap(int[] arr, int n) {
        buildHeap(arr,n);

        for(int i = n-1; i>=1; i--){ // recursively call heapify from left most node till root(first element of array) of tree
            swap(arr,0,i); // swap last element  and first element of array
            heapify(arr,i,0); //

        }
    }

    static void buildHeap(int[] arr, int n) {

        for(int i = (n-2)/2; i>=0; i--){ // start from root node of left most node (n-1)/2 is last node and its root is (n-1)-1/2
            heapify(arr,n,i); // recursively call heapify from root of left most element
        }
    }

    static void heapify(int[] arr, int n, int i) {
        int largest = i; // parent of left most node
        int left = 2*i+1; // using formula left node
        int right   = 2*i+2; // using formula right node o

        if(left<n && arr[left] > arr[largest]){
            largest = left;

        }
        if (right <n && arr[right]>arr[largest]){
            largest = right;
        }
        if(largest!=i){ // checking is root node and left or right node is not same
            swap(arr,i,largest); // swap largest element with its root
            heapify(arr,n,largest); // now call heapify for its root element
        }
    }

    static void swap(int[] arr, int i, int largest) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

    }
}
