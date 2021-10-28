package Sorting;

public class mergeSort {

    public static void main(String[] args) {
        int[] arr1 = {1,2,3};// i < m
        int[] arr2 = {4,5,6};//j < n
//
        int m = arr1.length;
        int n = arr2.length;

        int i = 0; int j =0;

        while (i<m && j<n){

            if(arr1[i]<=arr2[j]){ // these condition will print element in increasing order making two array merge
                System.out.print(arr1[i]+" ");
                i++;

            }
            else {
                System.out.print(arr2[j]+" ");
                j++;
            }
        }
        // if one of array passes its length then we have to print remaining element of second array that is why these two loop are use
        while (i<m){
            System.out.print(arr1[i]+" ");
            i++;
        }
        while (j<n){
            System.out.print (arr2[j]+" ");
            j++;
        }
    }
}
