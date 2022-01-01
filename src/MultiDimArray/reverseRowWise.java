package MultiDimArray;

import java.util.Arrays;

public class reverseRowWise {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};

        reverseRow(arr);
      for(int[] arr1: arr){
          System.out.println(Arrays.toString(arr1));
      }
    }

    private static void reverseRow(int[][] arr) {

        for(int i=0; i<arr.length;i++){
            int start=0;
            int end = arr[0].length-1;

            while(start<end){
                int temp  = arr[i][start];
                arr[i][start] = arr[i][end];
                arr[i][end] = temp;
                start++;
                end--;
            }
        }

    }
}
