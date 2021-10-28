package Array;

import java.util.SortedMap;

public class slidingWindowSumInSubArray {
    static boolean sumFinder(int[] arr,int sum ){
        // this function does not work for negative numbers
        int current_sum = arr[0];
        int start = 0;
        int n = arr.length;

        for(int i =1; i < n;i++){

            while (current_sum>sum && start<i-1){ // if current sum is greater than sum then delete left most element one by one
                // i -1 means it can remove element till size of i-1
                current_sum  = current_sum - arr[start]; // this is deleting left most element one by one
                start++;
            }

            if(current_sum == sum){
                return true;
            }
            if(i<n){// checking still 'i' is less than n or not
                current_sum+=arr[i]; // this will take sum till current_sum is less than sum
            }

        }

        return(current_sum==sum); // this checking condition for last two element
    }


    public static void main(String[] args) {
        int[] arr = {1,8,30,1,20,7};
        int k = 3; // size of consecutive array
        int sum = 39; // sum needs to find in array


        // this approach is used when k is given by user
//        int current_sum = 0;
//        for(int i = 0 ; i<k; i++){
//            current_sum+=arr[i]; // sum of first k consecutive element is founds
//        }
//        if(current_sum == sum){
//            System.out.println("Sum found!");
//            System.exit(0);
//        }
//
//        for(int i = k; i< arr.length; i++){
//            current_sum = current_sum+(arr[i]-arr[i-k]); // element is slided by deleting left element from array
//            if(sum == current_sum){ // each time sum is checked if it is matched loop is break
//                System.out.println("Sum Found!");
//                break;
//            }
//        }
//        if(sum!=current_sum){
//            System.out.println("Sum not found!");
//        }

        // in order to find sum of sub array is equal to Given sum or not use following approach
        if(sumFinder(arr,31)){ // this function does not work for negative element
            System.out.println("sum found!!");
        }
        else {
            System.out.println("not found");
        }



    }
}
