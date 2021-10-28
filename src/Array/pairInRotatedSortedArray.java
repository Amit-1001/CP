package Array;

import java.sql.SQLOutput;

public class pairInRotatedSortedArray {

    public static boolean isPair(int[] arr,int n, int x){
        int i;
        for(i = 0 ; i < n-1; i++)
            if(arr[i]>arr[i+1]) // this will loop it we get max and small number which is rotated
                break;

        int lowestEleIndex = (i+1)%n;
        int highestEleIndex = i;

        while(lowestEleIndex!=highestEleIndex){

            if(arr[lowestEleIndex]+arr[highestEleIndex]==x){
               return true;
            }
            if(arr[lowestEleIndex]+arr[highestEleIndex]<x){ // if sum is less move to higher sum
                lowestEleIndex = (lowestEleIndex+1)%n;
            }
            else{
                highestEleIndex = (n+highestEleIndex-1 )%n;
            }
        }



        return false;
    }


    public static void main(String[] args){
        int [] arr   = {3,4,5,7,8,1,2}; // rotated sorted array;
        int x = 12;
        int n = arr.length;
        if(isPair(arr,n,x)){
            System.out.println("Array Has two elements with sum:"+x);
        }else{
            System.out.println("Not found");
        }


    }
}
