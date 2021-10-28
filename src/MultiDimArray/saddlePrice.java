package MultiDimArray;

import java.util.Scanner;

public class saddlePrice {
//    The saddle price is defined as the least price in the row but the maximum price in the column of the matrix

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int[][] arr = new int[n][n];

        for(int i =0; i<n; i++){
            for( int j =0; j < n; j++){
                arr[i][j] = in.nextInt();
            }
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int col=0;
        boolean res = false;
        boolean found_min;
        for(int i =0; i<n; i++){
             min = Integer.MAX_VALUE;
             max = Integer.MIN_VALUE;
            found_min = false;
            for(int j =0; j<n; j++){
                if(arr[i][j]<min){
                    min = arr[i][j];
                    col =j;
                    found_min = true;
                }
            }
            if(found_min){
                for(int k =0; k<n; k++){
                    if(arr[k][col]>max){
                        max = arr[k][col];
                    }
                }
            }

            if(min == max ){
                res = true;
                break;
            }

        }


        if(res == true){
            System.out.println(max);
        }
        else{
            System.out.println("Invalid input");
        }
    }
}
