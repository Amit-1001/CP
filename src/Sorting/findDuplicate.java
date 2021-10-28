package Sorting;

import java.util.Arrays;

public class findDuplicate {

   public static void main(String[] args){
       int[] nums = {1,3,2,4,6,1};

       boolean res = findDup(nums);
       System.out.println(res);

   }

    static boolean findDup(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {

            if (nums[i] == nums[i + 1]) return true;
        }
        return false;
   }


}
