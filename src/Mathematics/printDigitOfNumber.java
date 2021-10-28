package Mathematics;

import java.util.Scanner;

public class printDigitOfNumber {
    public static void main(String[] args) {
        // write your code here
        Scanner in = new Scanner(System.in);
        int n =in.nextInt();
        int digits;
        int power=1;
        int rem;
        digits = (int)Math.log10(n)+1;
        power = (int)Math.pow(10,digits-1); // digits-1 causes we are multiplying with 10
        while(n!=0){


            // System.out.println(power);
            int val = n/power;

            System.out.println(val);
            n = n%power;

            power = power/10; // removing one zero from power as number is decreasing
            // System.out.println(n);

        }

    }

}
