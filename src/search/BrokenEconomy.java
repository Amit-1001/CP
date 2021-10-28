package search;

import java.util.Scanner;


public class BrokenEconomy {
//
//              1. You are given a number n, representing the size of array a.
//              2. You are given n numbers, representing elements of the array a.
//              3. You are given another number d.
//              4. You are required to find the ceil and floor of d in array a.

//    Example 1: In a country, 8 given denominations are as follows
//                  [5, 10, 15, 22, 33, 40, 42, 55]
//
//    The foreigner asks for denomination 25.
//    The money exchange tells them that denominations of 33 and 22 are available.

    //    Output Format
    //    A number representing ceil 33
    //    A number representing floor 22

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int[] arr = new int[n];

        for(int i =0;i<n;i++){
            arr[i] = in.nextInt();
        }
        int data= in.nextInt();

        int left = 0;
        int right = arr.length - 1;
        int ceil = 0;
        int floor =  0;

        while(left <= right){
            int mid = (left + right) / 2;

            if(data > arr[mid]){
                left = mid + 1;
                floor = arr[mid];
            } else if(data < arr[mid]){
                right = mid - 1;
                ceil = arr[mid];
            } else  {
                floor = arr[mid];
                ceil = arr[mid];
                break;
            }
        }

        System.out.println(ceil);
        System.out.println(floor);
    }
}
