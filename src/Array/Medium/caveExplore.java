package Array.Medium;

public class caveExplore {

    // we have given array and pairs
    // pairs is range and we supposed to find sum of all pairs obtained by array
    // ex  arr={5,6,7} and pair={3,2,3}
    //(3,2) if first number is bigger than last number swap it and take it as (2,3):  (2,3) = sum from index 2 to 3 in arr which is : 13
    //(2,3) will give 13
    // and sum of all pairs is 26
    public static int solve(int n, int m, int[] arr, int[]pairs ){

        int[] prefix_sum = new int[n];
        prefix_sum[0] = arr[0];
        for(int i=1; i<arr.length;i++){
            prefix_sum[i] =prefix_sum[i-1]+arr[i];
        }
        int res =0;
        for(int i=1; i<=m-1;i++){
            res += getSum(prefix_sum,pairs[i-1],pairs[i]);
        }

        return res;

    }

    public  static int getSum(int[] prefix_sum, int start, int end){
        if(start>end){ // swaping number if start is greater than end
            int temp = start;
            start = end;
            end = temp;
        }

        if(start!=0){
            return prefix_sum[end] - prefix_sum[start-1];
        }

        return prefix_sum[end]; // if start is 0 then sum is till end in prefix

    }

    public static void main(String[] args) {

        int[] arr = {5,2,6,7};

        int[]  pairs ={3,2,3};

        System.out.println("Sum:"+solve(arr.length,pairs.length,arr,pairs));


    }
}
