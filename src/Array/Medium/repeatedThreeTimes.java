package Array.Medium;

public class repeatedThreeTimes {


    private static final int INT_SIZE = 32; // 32 bit size of Int

    // every number occur 3 times return number which occur ones
    // Time complexity O(n)
    //space Complexity O(1)
    public static void main(String[] args) {
        int[] arr ={1,2,1,1,4,5,4,4,5,5};

        int res = findAloneNumber(arr);
        System.out.println(res);

    }

    private static int findAloneNumber(int[] arr) {
        int result = 0;
        int x, sum;
        int n = arr.length;
        // Iterate through every bit
        for (int i = 0; i < INT_SIZE; i++) {
            // Find sum of set bits at ith position in all
            // array elements
            sum = 0;
            x = (1 << i);
            for (int j = 0; j < n; j++) {
                if ((arr[j] & x) != 0)
                    sum++;
            }
            // The bits with sum not multiple of 3, are the
            // bits of element with single occurrence.
            if ((sum % 3) != 0)
                result |= x;
        }
        return result;
    }
}
