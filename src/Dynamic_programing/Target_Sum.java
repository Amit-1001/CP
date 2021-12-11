package Dynamic_programing;

import java.util.Scanner;

public class Target_Sum {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n    =  in.nextInt();

        int[] arr = new int[n];
        for(int i=0; i< n ; i++){
            arr[i] = in.nextInt();
        }


        int sum = in.nextInt();

        boolean[][] dp = new boolean[n+1][sum+1]; // 2d array with boolean value

        for(int i=0; i<dp.length;i++){
            for(int j=0; j<dp[0].length;j++){
                if(j==0 && i == 0){ // first place which is top left corner will always be true
                    dp[i][j] = true;
                }
                else if(i==0){ // first row will false
                    dp[i][j] = false;
                }
                else if(j==0){
                    dp[i][j] = true; // first column will true
                }
                else{

                    if(dp[i-1][j]== true){ // if previous row is true then current postion will be true also
                        dp[i][j] = true;
                    }
                    else{

                        int val = arr[i-1]; // we used i - 1 cause we are staring from 1 not 0 0 row is all false
                        if(j>=val){ // current jth element should greater than or equal to val

                            if(dp[i-1][j-val] == true){ // jth element is greater than equal to val then remaining score must be scored by j - val th element
                                dp[i][j] = true;
                            }

                        }
                    }


                }
            }
        }

        System.out.println(dp[arr.length][sum]); //

    }
}


//5
//4
//2
//7
//1
//3
//10 // target sum