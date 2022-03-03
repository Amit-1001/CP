package Dynamic_programing.easy;

import java.util.Scanner;

public  class climbStairsWithMinimumMoves {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n= in.nextInt();

        int[] arr = new int[n+1];

        for(int i=0;i<n;i++){
            arr[i] = in.nextInt();
        }

        Integer[] dp = new Integer[n+1];
        dp[n] = 0;
        int min =Integer.MAX_VALUE;

        for(int i=n-1;i>=0;i--){
            min = Integer.MAX_VALUE;

            if(arr[i]>0){

                for(int j =1; j<=arr[i] && i+j < dp.length; j++){

                    if(dp[i+j]!=null){ // i+j should not be null
                        min = Math.min(min,dp[i+j]);
                    }
                }

            }
            if(min != Integer.MAX_VALUE){
                // this means we have found min ways to reach last value
                dp[i] = min+1; // update way to reach last value
            }
            else{
                // this means that we havent found any way to reach last value
                dp[i] = null;// no way is consider as null
            }
        }

        System.out.println(dp[0]);
    }
}