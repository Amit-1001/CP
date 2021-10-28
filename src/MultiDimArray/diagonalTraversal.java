package MultiDimArray;

import java.util.Scanner;

public class diagonalTraversal {
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner in = new Scanner(System.in);
        int n =  in.nextInt();

        int[][] arr = new int[n][n];

        for(int i=0;i<n; i++ ){
            for(int j=0; j<n;j++){
                arr[i][j] = in.nextInt();
            }
        }


        // diagonal traversal
        for(int g = 0; g < arr.length; g++){
            for(int i = 0, j = i + g; j < arr.length; i++, j++){
                System.out.println(arr[i][j]);
            }
        }



    }
}
