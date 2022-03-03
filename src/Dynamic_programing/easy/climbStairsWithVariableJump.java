package Dynamic_programing;

import java.util.Scanner;

public class climbStairsWithVariableJump {

/*
    1. You are given a number n, representing the number of stairs in a staircase.
    2. You are on the 0th step and are required to climb to the top.
    3. You are given n numbers, where ith element's value represents - till how far from the step you
         could jump to in a single move.
         You can of course jump fewer number of steps in the move.
    4. You are required to print the number of different paths via which you can climb to the top.
*/
    /*
    Input

            10
            3
            3
            0
            2
            1
            2
            4
            2
            0
            0

    // Ans : 5

     */
public static void main(String[] args) throws Exception {
    // write your code here
    Scanner in = new Scanner(System.in);
    int n= in.nextInt();

    int[] arr = new int[n];

    for(int i=0; i<n; i++){
        arr[i] = in.nextInt();
    }

    int[] dp = new int[n];

    int ans = climbStairsWithVJ(0,n,arr);

    //int ans = climbStairsWithVJMemorization(0,n,arr,dp);

    System.out.println("Different paths:"+ans);
}


    // normal recurrsion
    public static int climbStairsWithVJ(int src, int des, int[] arr){
        if(src == des){
            return 1;
        }

        int count =0;

        for(int jump = 1; jump<=arr[src] && jump + src <= des; jump++ ){
            count += climbStairsWithVJ(src+jump, des,arr);
        }

        return count;
    }

    // with Memorization techniques
    public static int climbStairsWithVJMemorization(int src, int des, int[] arr, int[] dp){
        if(src == des){
            return dp[src] = 1; // storing 1 as one of paths of src
        }

        if(dp[src]!=0){
            return dp[src];
        }

        int count =0;

        for(int jump = 1; jump<=arr[src] && jump + src <= des; jump++ ){
            count += climbStairsWithVJ(src+jump, des,arr);
        }

        return dp[src] = count; // storing all paths of src position
    }

}
