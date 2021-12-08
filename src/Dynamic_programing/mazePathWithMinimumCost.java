package Dynamic_programing;

import java.util.Scanner;

public class mazePathWithMinimumCost {
    /*
            1. You are given a number n, representing the number of rows.
            2. You are given a number m, representing the number of columns.
            3. You are given n*m numbers, representing elements of 2d array a, which represents a maze.
            4. You are standing in top-left cell and are required to move to bottom-right cell.
            5. You are allowed to move 1 cell right (h move) or 1 cell down (v move) in 1 motion.
            6. Each cell has a value that will have to be paid to enter that cell (even for the top-left and bottom - right cell).
            7. You are required to traverse through the matrix and print the cost of path which is least costly.

    Input:
            6
            6
            0 1 4 2 8 2
            4 3 6 5 0 4
            1 2 4 1 4 6
            2 0 7 3 2 2
            3 1 5 9 2 4
            2 7 0 8 5 1

            Ans: 23


    */



    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner in =new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        int[][] arr = new int[n][m];

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j] = in.nextInt();
            }
        }

        int[][] dp = new int[n][m];

        // to solve such problem using tabular use following 3 steps
            /*
                1. find size of dp & meaning (value which needs to be inserted in dp)
                2. Direction of traverse here we choose to direction which is near to required ans
                3. Traverse and store
            */
        // in this problem we will be traversing array from end of array as we want to find mimum cost
        for(int i=arr.length-1; i>=0;i--){
            for(int j=arr[0].length-1;j>=0;j--){


                // below three condition dividing whole matrix in 4 section
                /*
                    1. first section consider that i and j are at max length which mean we are at last bottom corner which means we will store only current cost present at arr[i][j] postion
                    2. second section consider that we are at last row in matrix
                    3. third section consider  that we are at last column in matrix
                    4. fourth section consider at we have two choice either we can go in right or we can go in down direction
                 */

                if(i == dp.length -1 && j == dp[0].length-1){ //we are at bottom right corner
                    dp[i][j] = arr[i][j]; // we are simply storing cost which is present at that location
                }
                else if(i == dp.length-1){ // we are at last row
                    dp[i][j] = dp[i][j+1] + arr[i][j]; // when we are at last row we can only move in right direction column wise
                }
                else if(j == dp[0].length-1){ // we are at last column
                    dp[i][j] = dp[i+1][j] + arr[i][j]; // we are at last column we can only move in down direction row wise
                }
                else{

                    // else we can either move in right or down
                    // here we have to find minimum cost for that we take minimum of each cost

                    dp[i][j] = Math.min(dp[i+1][j],dp[i][j+1])+arr[i][j];
                    // as we are storing cost so far in dp we will get cost required before.
                    // dp[i+1][j] will have cost of down direction path
                    // dp[i][j+1] will have cost of right direction path
                    // taking min of these value and adding with current cost we get minimum cost so far.


                }
            }


        }

        System.out.println(dp[0][0]);
    }
}
