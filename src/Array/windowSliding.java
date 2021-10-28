package Array;

public class windowSliding {
    public static void main(String[] args) {
        int[] arr = {1, 8, 30, -5, 20, 7};
        int max = Integer.MIN_VALUE;
        int k = 3; // number of consecutive elements

        int sum =0;
        // this is naive solution complexity is O(n^2)
//        for (int i = 0; i+(k-1) < arr.length; i++) {
//           sum =0;
//            for (int j =0; j<k; j++){
//                sum = sum+arr[i+j];
//                max = Math.max(sum,max);
//            }
//
//        }
//
//        System.out.println(max);

        int current_sum = 0;
        int max_sum = 0;

        for(int i = 0 ; i< k; i++){ // finding sum of first k consecutive element
            current_sum  = current_sum +arr[i];
        }
        max_sum = current_sum; // first sum of first 3 consecutive element

        for(int i = k ; i<arr.length; i++){
            current_sum = current_sum+arr[i]-arr[i-k]; // this loop is sliding to right deleting one element from left side of array
            // k = 3
            max_sum  = Math.max(max_sum,current_sum); // finding max_sum between each slide of array
        }

        System.out.println(max_sum);


    }
}
