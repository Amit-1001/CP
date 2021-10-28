package Sorting;

import java.util.Arrays;

public class maximumGuest {
    public static void main(String[] args) {
        int[] arrive ={900,600,700};
        int[] dep = {1000,800,730};
        int size = arrive.length;
        int res =1,curr = 1, i = 1 , j =0;

        Arrays.sort(arrive);
        Arrays.sort(dep);

        while (i<size && j < size){
            if(arrive[i]<= dep[j]){
                curr++;
                i++;
            }
            else {
                curr--;
                j++;
            }
            res = Math.max(res,curr); // max count
        }

        System.out.println("Maximum guest meet:"+res);


    }
}
