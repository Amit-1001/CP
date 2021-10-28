import java.lang.management.ManagementFactory;
import java.sql.SQLOutput;
import java.util.*;

public class practice_code {
    public static int[] twoSum(int[] nums, int target) {

        int start =0;
        int end = nums.length-1;
        int[] res = new int[2];
        Arrays.sort(nums);


        while(start<end){
            if(nums[start]+nums[end]==target){
                res [0] = start;
                res [1] = end;
                break;
            }
            else if(nums[start]+nums[end]>target){
                end--;
            }
            else{
                start++;
            }
        }

        return res;

    }

    public static void main(String[] args) {

        int [] arr = {2,7,11,15};
        int [] res  = twoSum(arr,9);
        for (int i: res
             ) {
            System.out.println(i);
        }

    }
}
