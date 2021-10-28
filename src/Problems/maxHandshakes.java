package Problems;

import java.util.Scanner;

public class maxHandshakes {
    int fact(int n ){
        if(n==0){
            return 1;
        }
        return n*fact(n-1);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        maxHandshakes obj = new maxHandshakes();
        System.out.println("Enter no of People");
        n = in.nextInt();

        int result = n*(n-1)/2;
        System.out.println("No of handshake by people considering one person only once:"+result);


    }
}
