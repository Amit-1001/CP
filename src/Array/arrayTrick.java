package Array;

import java.util.Arrays;

public class arrayTrick {
    public static void main(String[] args){
        int[][] arr =
                {
                        {1,3,4},
                        {2,4,5},
                        {6,7}
                };

        // here a will point to each array in 2D array
        for(int[] a: arr){
            System.out.println(Arrays.toString(a)); // this is converting each row into string
        }
        //other method
        System.out.println("Other method");
        for(int row =0 ; row <arr.length; row++){
            System.out.println(Arrays.toString(arr[row]));
        }
    }
}
