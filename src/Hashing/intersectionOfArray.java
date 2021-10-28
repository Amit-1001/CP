package Hashing;

import java.util.Arrays;
import java.util.HashSet;

public class intersectionOfArray {
    public static void main(String[] args) {
        Integer [] a ={10,30,20,10,40,20};
        Integer [] b = {10,20,30};

        HashSet<Integer> h = new HashSet<Integer>(Arrays.asList(a)); // this will store all distinct element in hash

       int count = 0;

       for(int x :b){
           if(h.contains(x)){
               count++;
               h.remove(x);
           }
       }

        System.out.println("Common element are:"+count);


    }
}
