package Array;

public class MaxSumOfSubArray {
    static void subArraySum(int[] arr){
        int sum =0;
        int max =0;

        for(int i =0 ; i < arr.length; i++){
            sum =0;
            for(int j =i+1 ; j<arr.length; j++){
                sum+= arr[j];

                if(max < sum){
                    max = sum;
                }
            }

        }

        System.out.println("Maximum of sub array is :"+max);
    }

    // this is kadane's algorithm
    public static void main(String[] args) {
        int [] arr ={-1,-2,-3,-4};
        int current_max =arr[0];
        int res = arr[0];

        for(int i =1;i<arr.length;i++){
           current_max = Math.max(current_max+arr[i],arr[i]);// here we are finding max between previous element and current element
            res = Math.max(res,current_max);// this store maximum sum
        }

        //naive approach
        //subArraySum(arr);

        System.out.println(res);
    }
}
