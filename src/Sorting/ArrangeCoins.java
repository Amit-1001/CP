package Sorting;

public class ArrangeCoins {
//    You have n coins and you want to build a staircase with these coins.
//    The staircase consists of k rows where the ith row has exactly i coins.
//    The last row of the staircase may be incomplete.
    // https://leetcode.com/problems/arranging-coins/



//    The problem is basically asking the maximum length of consecutive number that has the running sum lesser or equal to `n`.
//    In other word, find `x` that satisfy the following condition:
    //
//            `1 + 2 + 3 + 4 + 5 + 6 + 7 + ... + x <= n`
//            `sum_{i=1}^x i <= n`
//    Running sum can be simplified,
//
//            `(x * ( x + 1)) / 2 <= n`

    public static int arrangeCoins(int n) {
        long left = 0, right = n;
        long k, curr;
        while (left <= right) {
            k = left + (right - left) / 2;
            curr = k * (k + 1) / 2;

            if (curr == n) return (int)k;

            if (n < curr) {
                right = k - 1;
            } else {
                left = k + 1;
            }
        }
        return (int)right;
    }

    public static void main(String[] args) {
        System.out.println(arrangeCoins(5));
    }
}
