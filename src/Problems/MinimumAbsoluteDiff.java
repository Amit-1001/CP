package Problems;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumAbsoluteDiff {
    public static int MinSum(int[] arr, int n){
        // sort the given array
        Arrays.sort(arr);

        Arrays.sort(arr);
        int min = 2000000000;
        for (int i = 1; i < n; i++) {
            min = Math.min(Math.abs(arr[i]-arr[i-1]), min); // finding min diff

        }


        return min;
    }
    public static void main(String[] args) {

        int n;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n ;i++){
            arr[i] = in.nextInt();
        }
        int result = MinSum(arr,n);
        System.out.println("Minimum Absolute difference:"+result);
    }
}
