package Hashing;

import java.sql.SQLOutput;
import java.util.HashSet;

public class sumZero {

    public static void main(String[] args) {
        int [] arr ={3,3,-4,-2};
        HashSet<Integer> h = new HashSet<>();

        int pre_sum =0;

        for(int i = 0; i< arr.length; i++){
            pre_sum = pre_sum + arr[i];

            if(arr[i]==0 || h.contains(pre_sum) || pre_sum ==0){
                System.out.println("It has sub array with sum zero");
                System.exit(0);
            }

            else {
                h.add(pre_sum);
            }
        }
    }
}
