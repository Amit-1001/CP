package MultiDimArray;

import java.util.Arrays;
import java.util.Scanner;

public class setZeroOptimal {
   public static void fillRowWithZero(int[][] matrix, int index, int row_size) {
        for(int i = 0 ;i < row_size ;i++) {
            matrix[index][i] = 0;
        }
    }
   public static void fillColumnWithZero(int[][] matrix, int index, int col_size) {
        for(int i = 0;i < col_size; i++) {
            matrix[i][index] = 0;
        }
    }
    public static void setRowColumnZeroes(int[][] matrix){
        int row_size = matrix.length;
        int col_size = matrix[0].length;
        boolean topRowZero = false, leftColumnZero = false;
        for (int i = 0; i < row_size; i++) {
            for (int j = 0; j < col_size; j++) {
                if(matrix[i][j] == 0) {
                    if(i == 0 && j == 0) {
                        topRowZero = true;
                        leftColumnZero = true;
                    } else if(j == 0) {
                        leftColumnZero = true;
                        matrix[i][0] = 0;
                    } else if(i == 0) {
                        topRowZero = true;
                        matrix[0][j] = 0;
                    } else {
                        matrix[i][0] = 0;
                        matrix[0][j] = 0;
                    }
                }
            }
        }
        for (int i = 1; i < col_size; i++) {
            if(matrix[0][i] == 0) {
                fillColumnWithZero(matrix, i, row_size);
            }
        }
        for(int i = 1; i < row_size; i++) {
            if(matrix[i][0] == 0) {
                fillRowWithZero(matrix, i, col_size);
            }
        }
        if(topRowZero == true) {
            fillRowWithZero(matrix, 0, col_size);
        }
        if(leftColumnZero == true) {
            fillColumnWithZero(matrix, 0, row_size);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[][] arr = new int[n][m];

        for(int i =0; i<arr.length; i++){
            for(int j =0; j<arr[0].length; j++){
                arr[i][j] = in.nextInt();
            }
        }

        setRowColumnZeroes(arr);

        for(int[] a: arr){
            System.out.println(Arrays.toString(a));
        }
    }
}
