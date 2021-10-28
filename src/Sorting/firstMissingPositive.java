package Sorting;

public class firstMissingPositive {
    public static void main(String[] args) {
        int[] arr = {-1,2,0,3};

        int res =findMissing(arr);
        System.out.println(res);
    }

    public static int findMissing(int[] nums) {
        int correct_index=0;
        int i =0;
        while(i<nums.length){
            correct_index = nums[i]-1;

            if(nums[i]>0 && nums[i] < nums.length && nums[i]!=nums[correct_index]){
                swap(nums,correct_index,i);
            }
            else{
                i++;
            }
        }

        int missing=0;
        for(int j = 0; j<nums.length; j++){
            if(nums[j]!=j+1){
                return j+1;
            }
        }
        return nums.length+1; //when all element are sorted then last element is missing

    }


    public static   void swap(int[] nums, int a, int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
