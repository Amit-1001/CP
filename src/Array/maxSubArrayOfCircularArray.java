package Array;

public class maxSubArrayOfCircularArray {
    // main logic is to find first maximum sum of sub array then find maximum sum of circular array
    // to find circular array first find minimum of sub array and add it in sum of array elements
    // to find minimum sum of sub array we have to invert array
    static int maxSubArray(int[] arr,int n){
        int res = arr[0];
        int current_sum = arr[0];

        for(int i =1 ; i< n ; i++){
            current_sum = Math.max(arr[i],current_sum+arr[i]);
            res = Math.max(res,current_sum);
        }

        return res; // returns maximum sum of sub array
    }


    public static void main(String[] args) {
        int[] arr = {8,-4,3,-5,4};
        int max_sum = maxSubArray(arr,arr.length);

        if(max_sum<0){
            System.out.println(max_sum);
            System.exit(0);
        }
        int arr_sum =0;
        for(int i = 0; i< arr.length;i++){
            arr_sum = arr_sum+arr[i];
            arr[i] = -arr[i]; // inverting element or array
            // by inverting array we get max sum of circular array, without inverting them this max sum would correspond to minimum sum of circular sub array

        }
        // if we don't use above method we might need to create new function for finding min sum from array
        // and subtracting min sum of circular sub array from sum of whole array to get maximum sum of circular sub array
        int max_circular = arr_sum + maxSubArray(arr,arr.length); //sum + (maximum sum of inverted array)

        int res = Math.max(max_sum,max_circular);

        System.out.println("Max sub array is:"+res);

    }
}
