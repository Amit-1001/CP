package Array;

import java.util.Arrays;

public class Frequencies_In_SortedArray {
// time complexity is O(n)
    static void printFreq(int arr[], int n)
    {
        int freq = 1, i = 1;

//        while(i < n)
//        {
//            while(i < n && arr[i] == arr[i - 1]) // checking if previous same or not
//            {
//                freq++; // increase frequency by one if element is same
//                i++;
//            }
//
//            System.out.println(arr[i - 1] + " " + freq);
//// if element is not same freq will reset to 1
//            i++;
//            freq = 1;
//        }
    for( i =1; i<arr.length;i++){
        if(arr[i-1]==arr[i]){
            freq++;

        }
        else{
            System.out.println(arr[i-1]+" "+freq);
            freq = 1;

        }


    }
        if(i == arr.length){ // for last elements
            System.out.println(arr[i-1]+" "+freq);
        }

    }



    public static void main(String args[])
    {
        int arr[] = {10, 10, 20, 30, 30, 30}, n = 6;

        printFreq(arr, n);

    }
}
