package Hashing;

import java.util.Arrays;
import java.util.HashSet;

public class unionOfarray {
    public static void main(String[] args) {
        Integer [] a ={10,30,20,10,40,20,50};
        Integer [] b = {10,20,30,50};

        HashSet<Integer> hash = new HashSet<>(Arrays.asList(a));

        int size = hash.size();

        for(int x:b){
            if(hash.contains(x)){
               continue;
            }
            else {
                size++;
            }

        }

        System.out.println("Union size of Array is :"+size);

    }
}
