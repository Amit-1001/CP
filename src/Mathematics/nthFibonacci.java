package Mathematics;

import java.util.Scanner;

public class nthFibonacci {
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n+1];
        arr[0] = 0;
        arr[1] = 1;

        for(int i =2; i<=n; i++){
            arr[i] = arr[i-1] + arr[i-2];
        }

        System.out.print(arr[n]);

    }
}
