package Problems;

import java.util.Scanner;

public class palidrom {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        int rev;
        int dubN;
        int lastDigit;
        System.out.println("Enter number:");
        n = in.nextInt();
        dubN = n;
        rev = 0;
        while(n>0){
            lastDigit = n%10;
            rev = (rev*10)+lastDigit;
            n = n/10;
        }
        if(rev == dubN){
            System.out.println("Number is palindrom!");
        }
        else
        {
            System.out.println("Number is not Palindrom!");
        }
    }
}
