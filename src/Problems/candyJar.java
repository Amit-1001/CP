package Problems;

import java.util.Scanner;

public class candyJar {
    public static void main(String[] args) {
        int N=10;
        int available=0;
        Scanner in  = new Scanner(System.in);
        int m = in.nextInt();

        if(m!=0 && m <=10){
            N = N - m;
            if(N == 0 | N <=5){
                N=10;
                System.out.println("Number of Candy sold:"+m);
                System.out.println("Jar Refilled:"+N);

            }
            else{
                System.out.println("Number of Candy sold:"+m);
                System.out.println("Number of Candy left:"+N);
            }

        }
        else{
            System.out.println("Invalid Input");
            System.out.println("Number of candy left:"+N);
        }
    }
}
