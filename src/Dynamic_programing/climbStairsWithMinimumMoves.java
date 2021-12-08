package Dynamic_programing;

import java.util.Scanner;

public  class climbStairsWithMinimumMoves {

    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);

        int n = in.nextInt();
        int[] arr = new int[n];

        int[] dp = new int[n+1];

        for(int i =0;i<n;i++){
            arr[i] = in.nextInt();
        }
    }
}