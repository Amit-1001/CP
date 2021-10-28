package Hashing;

import java.util.HashMap;
import java.util.*;
import java.util.HashSet;

public class moreThanNbyKOccurrence {
    public static void main(String[] args) {
        int[] arr = {30,10,20,20,10,20,30,30};
        HashMap<Integer,Integer>  m = new HashMap<>();
        int k =4;
        for(int i = 0;i<arr.length;i++){
            m.put(arr[i],m.getOrDefault(arr[i],0)+1);
        }

//        System.out.println("Occurrences");
//        for(Map.Entry<Integer,Integer>e: m.entrySet()){
//            System.out.println(e.getKey()+" "+e.getValue());
//        }
            int n = arr.length;
        for(Map.Entry<Integer,Integer>e: m.entrySet()){
            if(e.getValue()>(n/k)){
                  System.out.println(e.getKey()+" ");
            }
       }
    }
}
