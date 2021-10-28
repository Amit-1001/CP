package MultiDimArray;

import java.util.HashSet;
import java.util.Set;

public class pairOfsum {
    public static void main(String[] args) {
        int [] arr = {8,9,2,1,4};

        int sum = 6;

        int y;

        Set<Integer> h= new HashSet<Integer>();

        for(int x : arr){
            y= sum -x;
            if(h.contains(y)){
                System.out.println("Sum is present pair is :"+x+" "+y);
            }
            else {
                h.add(x);
            }
        }
    }
}
