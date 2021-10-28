package recurrsion;

import java.util.Scanner;

public class stairCase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        printStairs(n,"");
    }

    private static void printStairs(int n, String s) {
        if(n<0){
            return;
        }
        if(n==0){
            System.out.println(s);
            return;
        }

        printStairs(n-1,s+1);
        printStairs(n-2,s+2);
        printStairs(n-3,s+3);
    }
}
