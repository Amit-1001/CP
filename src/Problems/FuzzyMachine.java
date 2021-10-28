package Problems;

import java.util.Scanner;

public class FuzzyMachine {



    public static void main(String[] args) {

        int time = 0;
        int weight = 0;

        Scanner in = new Scanner(System.in);
        weight =in.nextInt();

        if(weight == 0){
            System.out.println("Time Estimated:0 Minutes");
        }

        else if(weight>=0 && weight<=2000){
            System.out.println("Time Estimated:25 Minutes");
        }
        else if(weight>2000&& weight<=4000){
            System.out.println("Time Estimated:35 Minutes");
        }
        else if(weight>4000 && weight <=7000){
            System.out.println("Time Estimated:45 Minutes");
        }
        else {
            System.out.println("Overloaded");
            System.out.println("Time Estimated:0 Minutes");
        }
    }
}

