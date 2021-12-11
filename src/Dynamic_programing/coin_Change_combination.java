package Dynamic_programing;

import java.util.Scanner;

public class coin_Change_combination {
    public static void main(String[] args) throws Exception {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int[] arr =new int[n];

        for(int i=0; i<arr.length;i++){
            arr[i] = in.nextInt();
        }

        int amt = in.nextInt();

        int[] dp = new int[amt+1];

        dp[0] = 1; // initially we get 0 for all coins

        for(int i=0; i<arr.length;i++){ // here we are taking coins one by one
            for(int j = arr[i]; j<dp.length;j++){ // traversing from arr[i] in forward direction cause previous element will give negative
                dp[j] = dp [j] + dp[j-arr[i]];  // current count + previous count of dp[j-arr[i]];
            }
        }

        // 2 2 3 and 2  5
        System.out.println("Possible coin combination:"+dp[amt]);
    }
}
