package Hashing;

import java.util.HashSet;

public class subArraySum {
    public static void main(String[] args) {
        int [] arr = {10,2,4,5,3};
        int sum =7;
        int pre_sum =0;
        int result =0;

        HashSet<Integer> h = new HashSet<>();

        for(int x:arr){
            pre_sum+=x;
            result = pre_sum - sum;

            if(pre_sum==sum||h.contains(result)){
                System.out.println("Sum found!");
            }
            else {
                h.add(pre_sum);
            }
        }




    }
}
