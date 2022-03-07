package Dynamic_programing.easy;

import java.util.Scanner;

public class unboundedKnapsack {
    public static int findMax(int[] items, int[] weights, int tar){
        int[][] dp = new int[items.length+1][tar+1];


        // whole code is same as zero one knapsack
        for(int i =0; i<dp.length; i++){
            for(int cap = 0; cap<dp[0].length; cap++){

                if(i==0){
                    dp[i][cap] = 0;
                }
                else if(cap ==0 ){
                    dp[i][cap] = 0;
                }else {
                    int prevMax = dp[i-1][cap];
                    int currentMax = 0;

                    if(cap-weights[i-1]>=0){
                        currentMax = dp[i][cap-weights[i-1]] + items[i-1]; // only change in zero one knapsack code to make unbounded knapsack is dp[i][c-weights[i-1]]
                    }

                    dp[i][cap] = Math.max(prevMax,currentMax);
                }
            }
        }

        return dp[dp.length][dp[0].length];





    }

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int[] items = new int[n];
        int[] weights = new int[n];

        for(int i=0; i<n;i++){
            items[i] = in.nextInt();
        }

        for(int i =0; i<n; i++){
            weights[i] = in.nextInt();
        }

        int tar = in.nextInt();

        int res = findMax(items,weights,tar);

        System.out.println(res);


    }

}
