package Array;

public class maxConsecutiveOnesII {
//
//    Given a binary array nums and an integer k,
//            return the maximum number of consecutive 1's in the array if you can flip at most k 0's.
    // https://youtu.be/QPfalDbqa4A

    public static  int logestOnes(int[] nums, int k){
        int count_zero=0;
        int max =0;
        int j=-1;

        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                count_zero++;
            }
            while(count_zero>k){
                j++;

                if(nums[j]==0){
                    count_zero--;
                }
            }

            int len = i-j;
            if(len>max){
                max = len;
            }
        }
        return max;

    }

    public static void main(String[] args) {
        int[] arr ={1,1,1,0,0,0,1,1,1,1,0};
        int k =2;

        System.out.println(logestOnes(arr,k));
    }
}
