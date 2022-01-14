package Array;

import java.util.Scanner;

public class additionOfDifferentBase {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        /**
         * 1. You will be given 2 integer numbers and their base respectively.
         * 2. You will also be given an number representing destination base.
         * 3. You have to add those numbers and give the result of addition in destination base.
         * */
        
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int b1 = in.nextInt();

        int n2 = in.nextInt();
        int b2 = in.nextInt();

        int D = in.nextInt();

        int num1 = toDecimal(n1,b1);
        int num2 = toDecimal(n2,b2);
        int add = num1+num2;

        int res = InBase(add,D);

        System.out.println(res);
    }

    public static int toDecimal(int n, int b) {
        int multiplier = 0, ans_num = 0;
        while (n > 0) {
            int remainder = n % 10;
            n = n / 10;
            ans_num += remainder * Math.pow(b, multiplier);
            multiplier++;
        }
        return ans_num;
    }

    public static int InBase(int n, int b) {
        int ans_num = 0, multiplier = 1;
        while (n > 0)
        {
            int remainder = n % b;
            n = n / b;
            ans_num = ans_num + remainder * multiplier;
            multiplier *= 10;
        }
        return ans_num;
    }
}
