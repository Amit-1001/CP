package Dynamic_programing;

import java.util.Scanner;

public class fibonacciDp {
    public static int fibMem(int n, int[] dp){
        if(n<=1){
            return dp[n] = n;
        }

        if(dp[n]!=0){
            return dp[n];
        }
        int n1 = fibMem(n-1,dp);
        int n2 = fibMem(n-2,dp);
        int ans = n1+n2;

        return dp[n] = ans;
    }

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] dp = new int[n+1];

        System.out.println(fibMem(n,dp));
    }

}
