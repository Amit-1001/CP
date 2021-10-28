package Hashing;

import java.util.HashMap;
import java.util.HashSet;

public class countDifferentEle {
    public static void main(String[] args) {
        int[] arr = {10,20,10,10,20,30,40};

        HashSet<Integer> h = new HashSet<>();

        for(int i = 0; i< arr.length;i++){
            h.add(arr[i]);
        }

        System.out.println("Size of Distinct element is:"+h.size());
    }

}
