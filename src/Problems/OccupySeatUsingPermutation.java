package Problems;

import java.util.Scanner;



public class OccupySeatUsingPermutation {
    int fact (int fac){
        if(fac == 0){
            return 1;
        }
        return  fac * fact(fac-1);

    }
    public static void main(String[] args) {
        int no_of_people;
        int seat_occupy;
        OccupySeatUsingPermutation obj  = new OccupySeatUsingPermutation();
        Scanner in = new Scanner( System.in);
        System.out.println("Enter No of people:");
        no_of_people = in.nextInt();
        System.out.println("Enter No of seat:");
        seat_occupy = in.nextInt();

        int result;
        int top = (obj.fact(no_of_people));
        int down = (obj.fact(no_of_people-seat_occupy));
         result = top/ down;
        System.out.println("No of seat can Occupy by people:"+result);
    }
}
