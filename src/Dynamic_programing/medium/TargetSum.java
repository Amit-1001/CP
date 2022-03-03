package Dynamic_programing.medium;

import java.util.Scanner;

public class TargetSum {

    public static boolean findTarget(int[]arr, boolean[][] dp){
        // considering that all element present in arr are scores and index of arr is player
            /**         dp[n+1][target+1]
             *               # = false
             *               Player 3 means using array index (0,1,2) -> (4,2,7)
             *               player (player indexing start from 1 and score indexing start from 0)
             *               Score achieve by players.
             *               player 1 -> 4 (if played can achieve 4 score if not played will achieve 0)
             *               player 2 -> 2
             *               player 3 -> 7
             *
             *                  0   1   2   3   4   5   6   7   8   9   10   <--- target
             *           0   |-T-|-#-|-#-|-#-|-#-|-#-|-#-|-#-|-#-|-#-|-#-|
             *
             * 0->4      1   |-T-|-#-|-#-|-#-|-T-|-#-|-#-|-#-|-#-|-#-|-#-|
             *
             * 1->2      2   |-T-|-#-|-T-|-#-|-T-|-#-|-T-|-#-|-#-|-#-|-#-|
             *
             * 2->7      3   |-T-|-#-|-T-|-T-|-T-|-#-|-T-|-T-|-#-|-T-|-#-|
             *
             * 3->1      4   |-T-|-T-|-T-|-T-|-T-|-T-|-T-|-T-|-T-|-T-|-T-|
             *
             * 4->3      5   |-T-|-T-|-T-|-T-|-T-|-T-|-T-|-T-|-T-|-T-|-T-|
             *
             *
             * */
            /*  In dp[][]
                rows -> target we want to achieve (score)
                column -> using player  can we achieve respective target (players)
            */
        for(int i=0; i<dp.length; i++){
            for(int j=0; j<dp[0].length; j++){
                if(j==0){ // first column is zero all players can achieve zero that's why it's true
                    dp[i][j] = true;
                }
                else if(i==0){ // first row after first column all column will be false as zero player cant achieve any score except zero as score
                    dp[i][j] = false;
                }
                else{
                    boolean notPlayed = dp[i-1][j]; // if current player didn't play then we will find if current score is achieved by previous player or not
                    boolean played = false;

                    if(j - arr[i-1] >=0){  // (j - target arr[i-1]) = score.
                        // score can be achieved only if score is positive
                        played = dp[i-1][j-arr[i-1]]; // if current player played then will check if remaining score is achieved by previous player or not
                        // here j-arr[i-1] is working as index of score which is remaining target we want to achieve
                    }

                    dp[i][j] = notPlayed || played ; // if any one of it is true then score is achievable
                }
            }
        }

        return dp[dp.length-1][dp[0].length-1]; // then ans will be store at tar which is present at last cell of dp[][]
    }

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] arr = new int[n];

        for(int i=0;i<n; i++){
            arr[i] = in.nextInt();
        }

        int tar = in.nextInt();

        boolean[][] dp = new boolean[n+1][tar+1];

        boolean res = findTarget(arr,dp);

        System.out.println(res);
    }

    /**
     * 1. You are given a number n, representing the count of elements.
     * 2. You are given n numbers.
     * 3. You are given a number "tar".
     * 4. You are required to calculate and print true or false, if there is a subset the elements of which add
     *      up to "tar" or not.
     *
     *      Input
     *
             5
             4
             2
             7
             1
             3
             10
            Output: true
     * */


}
