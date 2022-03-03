package Dynamic_programing.easy;

import java.util.Arrays;
import java.util.Scanner;

public class climbStairs {
//1. You are given a number n, representing the number of stairs in a staircase.
//2. You are on the 0th step and are required to climb to the top.
//3. In one move, you are allowed to climb 1, 2 or 3 stairs.
//4. You are required to print the number of different paths via which you can climb to the top.


    // with simple recurrsion
    public static int findCountOfStairs(int n){
        if( n == 0){
            return 1; // if n ==0 which means we have reached final step so this is one of possible answer
        }

        int count =0;

        // n-1, n-2, n-3 only three steps are allowed to climb 1,2,3
        if(n-1>=0){
            count += findCountOfStairs(n-1);
        }
        if(n-2>=0){
            count += findCountOfStairs(n-2);
        }
        if(n-3>=0){
            count += findCountOfStairs(n-3);
        }

        return count;

    }

    // using memorization
    public static int findCountOfStairsMem(int n, int[] dp){
        if(n==0){
            return dp[n] =1; // storing one possible answer
        }

        if(dp[n]!=0){
            return dp[n];
        }

        int count =0;
        // if(n-1>=0){
        //     count+= findCountOfStairsMem(n-1,dp);
        // }
        // if(n-2>=0){
        //      count+= findCountOfStairsMem(n-2,dp);
        // }
        // if(n-3>=0){
        //      count+= findCountOfStairsMem(n-3,dp);
        // }

        //using for loop
        for(int jump=1; jump<=3 &&  n-jump>=0; jump++){ // n-jump>=0 is handling all negative jumps
            count += findCountOfStairsMem(n-jump,dp);
        }

        dp[n] = count;

        int noOfPath = dp[n];

        return noOfPath;
    }


    // to convert into tabulation
    public static int countPathTabulation(int N , int[] dp){

        // if(dp[n]!=0){
        //     return dp[n]; // if path is already counted then return count
        // }

        for(int n =0; n<dp.length; n++){

            if(n==0){
                dp[n] =1; // if path reached zero then add 1 to nth position
                continue;
            }
            int count = 0; // for counting path

            if(n-1>=0){
                count += dp[n-1];//countPath(n-1,dp);
            }
            if(n-2>=0){
                count += dp[n-2];//countPath(n-2,dp);
            }
            if(n-3>=0){
                count += dp[n-3];//countPath(n-3,dp);
            }
            dp[n] = count; // storing one successful path at nth position
            // int path = dp[n]; // this is last count of all possible path count's to reached end
        }

        int paths = dp[N]; // final answer

        return paths;
    }


    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        //int res = findCountOfStairs(n);
        int[] dp = new int[n+1];
        //int res = findCountOfStairsMem(n,dp);
        int res = countPathTabulation(n,dp);
        System.out.println("Stairs count:"+res);
    }




}
