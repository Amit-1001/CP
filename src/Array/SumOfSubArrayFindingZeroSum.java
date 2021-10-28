package Array;

import java.util.HashSet;
import java.util.Set;

public class SumOfSubArrayFindingZeroSum {




    static int sumFinder(int[] arr){
        // Creates an empty hashset hs
        Set<Integer> hs = new HashSet<Integer>();

        // Initialize sum of elements
        int sum = 0;

        // Traverse through the given array
        for (int i = 0; i < arr.length; i++)
        {
            // Add current element to sum
            sum += arr[i]; // 6 + 2 + 3 + -3

            // Return true in following cases
            // a) Current element is 0
            // b) sum of elements from 0 to i is 0
            // c) sum is already present in hash map
            if (arr[i] == 0
                    || sum == 0
                    || hs.contains(sum))
                return 1;

            // Add sum to hash set
            hs.add(sum);
        }

        // We reach here only when there is
        // no subarray with 0 sum
        return 0;
    }



    public static void main(String[] args) {
        int [] arr = {6,2,3,-3};
        int sum =0;

        System.out.println(sumFinder(arr));

    }
}
