package Problems;

import java.util.Scanner;

public class quadrantCheck {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        int x,y;
        x = in.nextInt();
        y = in.nextInt();

        if(x>=0&&y>=0){
            System.out.println("First Quadrant!");
        }

        if(x<=0&&y>=0){
            System.out.println("Second Quadrant!");
        }

        if(x<=0&&y<=0){
            System.out.println("Third Quadrant!");
        }

        if(x>=0&&y<=0){
            System.out.println("Fourth Quadrant!");
        }
    }
}
