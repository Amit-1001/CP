public class PractiseCode {

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
        if(start>end){
            int temp = start;
            start = end;
            end = temp;
        }

       if(start!=0){
           return prefix_sum[end] - prefix_sum[start-1];
       }

       return prefix_sum[end];

    }

    public static void main(String[] args) {

            int[] arr = {5,2,6,7};

            int[]  pairs ={3,2,3};

        System.out.println("Sum:"+solve(arr.length,pairs.length,arr,pairs));


    }
}
