package Array.Medium;

import java.util.HashSet;

public class LongestSubsequenceOfConsecutive_numbers {
    public static int longestConsecutive(int[] nums) {

        HashSet<Integer> st = new HashSet<>();


        for(int i =0; i<nums.length;i++){
            st.add(nums[i]);
        }


        int long_length = 0;


        int current_length = 0;


        for(int i=0; i<nums.length; i++){
            current_length = 1;

            if(!st.contains(nums[i]-1)){

                int current_num = nums[i]; // starting point for consecutive number

                while(st.contains(current_num+1)){
                    current_num = current_num +1 ;// next consecutive number
                    current_length++;
                }
            }


            long_length = Math.max(current_length,long_length);
        }

        return long_length;
    }


    public static void main(String[] args) {
        int[] arr = {10,9,2,5,3,7,101,18};

        System.out.println("Longest Subsequence:"+longestConsecutive(arr));
    }
}
