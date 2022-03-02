package Dynamic_programing;

import java.util.Scanner;

public class mineGame {
    /**
     * 1. You are given a number n, representing the number of rows.
     * 2. You are given a number m, representing the number of columns.
     * 3. You are given n*m numbers, representing elements of 2d array a, which represents a gold mine.
     * 4. You are standing in front of left wall and are supposed to dig to the right wall. You can start from
     *      any row in the left wall.
     * 5. You are allowed to move 1 cell right-up (d1), 1 cell right (d2) or 1 cell right-down(d3).
     *
     * */

    /**
     * Input
      6
      6
      0 1 4 2 8 2
      4 3 6 5 0 4
      1 2 4 1 4 6
      2 0 7 3 2 2
      3 1 5 9 2 4
      2 7 0 8 5 1
     *
     * Ans : 33
     * */



    // this is simple recurrsive approach
    public static int goldMineR(int i,int j, int[][] arr){
        if(i<0 || i>=arr.length || j<0 || j>=arr[0].length){
            return 0;
        }

        int a = goldMineR(i-1,j+1,arr); //above row next column
        int b = goldMineR(i,j+1,arr); // present row next column
        int c = goldMineR(i+1,j+1,arr); // next row next column

        int max = Math.max(a,Math.max(b,c));

        int ans = max + arr[i][j];

        return ans;
    }

    public static int goldMineM(int i , int j, int[][] arr, int[][] dp){
        if(i<0 || i>=arr.length || j<0 || j>=arr[0].length){
            return 0;
        }

        if(dp[i][j]!=0){
            return dp[i][j];
        }


        // recursively calling paths
        int a = goldMineM(i-1,j+1,arr,dp); //above row next column ( arr[i-1][j+1] )
        int b = goldMineM(i,j+1,arr,dp);    // present row next column  ( arr[i][j+1] )
        int c = goldMineM(i+1,j+1,arr,dp);  // next row next column ( arr[i+1][j+1] )

        int max = Math.max(a,Math.max(b,c));

        int ans = max + arr[i][j];

        dp[i][j] = ans;

        return dp[i][j];

    }

    // tabulation

    public static int goldMineT(int[][] arr, int[][]dp){
        int n = arr.length-1; // rows
        int m = arr[0].length-1; // column

        for(int i =n; i>=0; i--){ // rows
            for( int j =m; j>=0; j--){ // column
                if(j == m){ // last column
                    dp[i][j] = arr[i][j];
                }  else if(i ==0){ // first row
                    dp[i][j] = arr[i][j] + Math.max(dp[i][j],dp[i+1][j+1]);
                }      else if( i == n){ // last row
                    dp[i][j] = arr[i][j] + Math.max(dp[i-1][j+1],dp[i][j+1]);
                }
                else{ // between element
                    int max = Math.max(dp[i-1][j+1],Math.max(dp[i][j+1],dp[i+1][j+1]));
                    int ans = max + arr[i][j];
                    dp[i][j] = ans;
                }
            }
        }
        // finding max cost which is stored in first column of dp
        int max =-1;

        for(int i=0; i<n; i++){
            max = Math.max(dp[i][0],max);
        }

        return max;

    }

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        int[][] arr = new int[n][m];


        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                arr[i][j] = in.nextInt();
            }
        }

        int[][] dp = new int[n][m];
        int max =-1;

        for(int i=0; i<n; i++){
            // int ans = goldMineR(i,0,arr);
            int ans = goldMineM(i,0,arr,dp);
            max = Math.max(max,ans);
        }

        System.out.println(max);


    }

}
