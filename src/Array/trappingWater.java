package Array;

public class trappingWater {
    public static void main(String[] args) {
        int[] arr = {3,0,1,2,5};
        int max=0;
        //int lmax = 0;
        //int rmax = 0;
        int res = 0;

        /// time complexity is O(n^2);
//        for(int i = 1; i<arr.length-1; i++){ // we have to find capacity between first and last element
//            // that is why i =1 and i<arr.length
//            for (int j = 0; j<i;j++){
//                lmax = Math.max(lmax,arr[j]);
//            }
//
//            for(int j = i+1;j<arr.length;j++){
//                rmax = Math.max(rmax,arr[j]);
//            }
//            res = res+(Math.min(lmax,rmax)-arr[i]);
//        }
//        System.out.println(res);


        //Better complexity O(n)
int n = arr.length; // size of array
        int[] lmax = new  int[n];
        int[] rmax = new int[n];
        lmax[0] = arr[0];
        for (int j = 1; j<n;j++){
                lmax[j] = Math.max(arr[j],lmax[j-1]);
            }
        rmax[n-1] = arr[n-1];
            for(int j = n-2;j>=0;j--){ // started from end
                rmax[j] = Math.max(arr[j],rmax[j+1]);
            }

            for(int i =1 ; i< n-1;i++){
                res = res+Math.min(lmax[i],rmax[i])-arr[i]; // minimum between left_max and right_max value current element is subtracted
                // and added to previous res which gives capacity
            }
        System.out.println(res);

    }


    // another optimal approach
    // used two pointer approach
//    This problem can be solved using constant space with the help of two pointers approach.
//
//    Take two pointers say left and right, pointing to the start and end of the given array and do the following while left is less than or equal to right.
//    If the array value at the left index is less than or equal to the array value at the right index then add the effective volume trapped at the left index and increment the left index.
//    Otherwise, add the effective volume at the right index and decrement the right index.
//     Also, keep updating the maximum height on the left and right sides to compute the effective volume at each index.



//    int volumeOfTrappedRainWater(int[] heights) {
//        int left = 0;
//        int right = heights.length - 1;
//        int volume = 0;
//        int maxLeft = 0, maxRight = 0;
//        while (left <= right) {
//            if (heights[left] <= heights[right]) {
//                if (heights[left] >= maxLeft) {
//                    maxLeft = heights[left];
//                } else {
//                    volume += maxLeft - heights[left];
//                }
//                left++;
//            } else {
//                if (heights[right] >= maxRight) {
//                    maxRight = heights[right];
//                } else {
//                    volume += maxRight - heights[right];
//                }
//                right--;
//            }
//        }
//        return volume;
//    }
    ///
}
