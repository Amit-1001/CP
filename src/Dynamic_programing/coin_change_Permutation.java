package Dynamic_programing;

import java.util.Scanner;

public class coin_change_Permutation {
    public static void main(String[] args) throws Exception {


        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int[] arr =new int[n];
        for(int i =0; i<arr.length;i++){
            arr[i] = in.nextInt();
        }
        int amt = in.nextInt();
        int[]dp = new int[amt+1];

        dp[0] = 1;
        for(int i=1; i<dp.length;i++){ // taking amount one by one
            for(int j = 0; j<arr.length; j++){ // taking coin one by one
                if(arr[j] <= i ){ // we take all coins which is less than current amount 'i'
                    dp[i] = dp[i] + dp[i - arr[j]]; // then we are taking count of current amount and previous amount
                }
            }
        }

        System.out.println(dp[amt]); // all possible changes of coins of 'amt'
    }
}


//4
//2
//3
//5
//6
//7
//
// 5 Ans