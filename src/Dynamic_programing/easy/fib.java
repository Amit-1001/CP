package Dynamic_programing.easy;

import java.util.Arrays;

public class fib {
    static int[] dp;

    public static void main(String[] args) {
        int n =10;
      dp= new int[n+1]; // dimension of dp is depends on no of parameter present in  function
        Arrays.fill(dp,-1); // always fill dp with such value which is not ans
        int res = fibonacci(n);

        System.out.println("Fibonacci of "+n+" is:"+res);
    }

    private static int fibonacci(int n) {


        if(dp[n]==-1){ // if number is not is visited
                int res;
            if(n==0 || n==1){
                res = n;
            }
            else{
                res = fibonacci(n-1) + fibonacci(n-2);
            }

            dp[n] = res; // storing res in dp
        }

        return dp[n]; // last element of dp is required result
    }
}
