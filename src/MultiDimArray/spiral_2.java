package MultiDimArray;

import java.util.Scanner;

public class spiral_2 {

//    https://www.youtube.com/watch?v=SVFXEqn3Ceo
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[][] arr = new int[n][m];

        for(int i =0; i<arr.length; i++){
            for(int j =0; j<arr[0].length; j++){
                arr[i][j] = in.nextInt();
            }
        }

        int min_row = 0, min_col = 0, max_row = arr.length-1, max_col = arr[0].length-1;

        int count =0;
//
//        while(count < n*m){
//            // left wall
//
//            for(int i = min_row; i<=max_row && count < n*m; i++){
//                System.out.println(arr[i][min_col]);
//                count++;
//            }
//
//            min_col++;
//
//            // bottom wall
//
//            for(int i = min_col; i <=max_col && count < n*m; i++){
//                System.out.println(arr[max_row][i]);
//                count++;
//            }
//            max_row--;
//
//            // right wall
//
//            for(int i = max_row; i>=min_row && count < n*m;i--){
//                System.out.println(arr[i][max_col]);
//                count++;
//            }
//            max_col--;
//
//            // top wall
//            for(int i=max_col; i>=min_col && count < n*m ; i--){
//                System.out.println(arr[min_row][i]);
//                count++;
//            }
//            min_row++;
//        }
        while(count<m*n){

            for(int i = min_col; i<=max_col && count<m*n; i++){
                System.out.println(arr[min_row][i]);
                count++;
            }
            min_row++;

            for(int i = min_row; i<=max_row && count < m*n; i++){

                System.out.println(arr[i][max_col]);
                count++;
            }

            max_col--;

            for(int i = max_col; i>=min_col && count < m*n;i--){
                System.out.println(arr[max_row][i]);
                count++;
            }
            max_row--;

            for(int i = max_row; i>=min_row && count < m * n; i--){
                System.out.println(arr[i][min_col]);
                count++;
            }
            min_col++;


        }


    }
}
