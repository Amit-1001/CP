package Array;

public class jump {
//    You are given an integer array nums. You are initially positioned at the array's first index, and each element in the array represents your maximum jump length at that position.
//
//    Return true if you can reach the last index, or false otherwise.
    public static void main(String[] args) {
        int [] nums = {3,2,1,1,4};

        int reachable = 0;
        for (int i=0; i<nums.length; ++i) {
            if (i > reachable) {
                System.out.println("False");
                return;
            }
            reachable = Math.max(reachable, i + nums[i]);
        }
        System.out.println("True");
    }
}
