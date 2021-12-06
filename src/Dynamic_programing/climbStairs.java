package Dynamic_programing;

import java.util.Arrays;
import java.util.Scanner;

public class climbStairs {
//1. You are given a number n, representing the number of stairs in a staircase.
//2. You are on the 0th step and are required to climb to the top.
//3. In one move, you are allowed to climb 1, 2 or 3 stairs.
//4. You are required to print the number of different paths via which you can climb to the top.


    static  int[] memorization;
    static int[] tabular;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        memorization = new int[n+1];
        tabular = new int[n+1];
        Arrays.fill(memorization,-1);

        int res = countStairs_memorization(n);

        System.out.println("Using memorization path count is:"+res);

        int res1 = countStairs_tabular(n);

        System.out.println("Using tabulation path count is:"+res1);

    }

    private static int countStairs_tabular(int n) {
        // this is another approach to solve DP problem

        // In tabular approach we are storing path count of each step
        // like for n =0 path count is 1 it will store at 0
        // like for n=1 path count is 1 it will store at 1
        // for n = 2 path count is  2 it will store at 2
        // for n = 3 path count is 4 it will store at 3;


        tabular[0] = 1;

        for(int i=1;i<=n;i++){
            if(i==1){
                tabular[i] = tabular[i-1]; // i-2 and i-3 will become negative
            }
            else if( i==2){
                tabular[i]  = tabular[i-1] + tabular[i-2]; // we didn't use i-3 because i will become negative
            }

            // above two condition  used to handle negative path
            else {
                tabular[i]  = tabular[i-1] + tabular [i-2] + tabular[i-3]; // here we are using i-1 , i-2 , i-3 because we can only 1 step , 2 step , and 3 step at time
            }
        }
        return tabular[n];
    }


    private static int countStairs_memorization(int n) {

        if(n==0){
            return 1;
        }
        else if( n < 0){
            return  0;
        }

        if(memorization[n]>0){ // if any path count of n is already present return that path
            return memorization[n];
        }

        int res1 = countStairs_memorization(n-1); // all path using step 1;
        int res2 = countStairs_memorization(n-2); // all path using step 2;
        int res3 = countStairs_memorization(n-3); // all path using step 3;

        int path = res1+res2+res3; // all path count;

        memorization[n] = path; // storing path count of n

        return path; // all possible path count
    }
}
