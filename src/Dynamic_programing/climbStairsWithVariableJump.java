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

    // this is tabular approach
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n = in.nextInt();
        int[] dp = new int[n+1];

        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = in.nextInt();
        }

        dp[n] = 1; // we are staring from end of array that is why there are only 1 path to reach end;
        // then we try add this path to n-1;

        for(int i=n-1;i>=0;i--){
            for(int j=1;j<=arr[i] && i+j<dp.length ;j++){ // we are staring from j=1 cause there will arr[i] number of ways to reach end
                dp[i] = dp[i]+dp[i+j]; // we add current ways and all way so far found in dp;
            }
        }

        System.out.println("Possible ways to end with Variable jump is:"+dp[0]);
    }
}
