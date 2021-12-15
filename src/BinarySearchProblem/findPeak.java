package BinarySearchProblem;

public class findPeak {

    //TimeComplexity O(Log n)
    // Binary Search approach
    public static int findPeakElement(int[] nums) {


        int start =0;
        int end = nums.length-1;

        while(start<end){
            int mid = start+(end-start)/2;

            if(nums[mid]<nums[mid+1]){
                // if mid is smaller than  mid + 1 we need to move forward in left direction
                start = mid+1;
            }
            else{
                end = mid; // here we are not doing mid -1 because we might lose peak. And we will go into right side of array.
            }
        }

        return start;

    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,1};// peak element is  3

        int res = findPeakElement(arr);

        System.out.println("Peak is At index:"+res);
    }
}
