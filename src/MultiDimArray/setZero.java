package MultiDimArray;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class setZero {
//    Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's, and return the matrix.
//
//    You must do it in place.


    public static void setZeroes(int[][] matrix) {

        int R = matrix.length;
        int C = matrix[0].length;
        Set<Integer> rows = new HashSet<Integer>();
        Set<Integer> cols = new HashSet<Integer>();

        // Essentially, we mark the rows and columns that are to be made zero
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (matrix[i][j] == 0) {
                    rows.add(i);
                    cols.add(j);
                }
            }
        }

        // Iterate over the array once again and using the rows and cols sets, update the elements.
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (rows.contains(i) || cols.contains(j)) {
                    matrix[i][j] = 0;
                }
            }
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
        setZeroes(arr);

        for(int[] a: arr){
            System.out.println(Arrays.toString(a));
        }


    }
}
