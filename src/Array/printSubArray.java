package Array;

import java.util.Scanner;

public class printSubArray {
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();

        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = in.nextInt();
        }
        StringBuilder sb = new StringBuilder();
        for(int i =0; i<n;i++){
            for(int j =i;j<arr.length;j++ ){

                for(int k = i;k<=j;k++){
                    System.out.print(arr[k] + "\t");
                }

                System.out.println();
            }
        }
    }


}
