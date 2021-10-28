package Hashing;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class countDistinctEleInspan {
    public static void main(String[] args) {
        int [] arr = {10,20,10,10,30,40};

        int k = 4;

        Map<Integer,Integer> m = new HashMap<>();

        for(int i =0  ; i<k;i++){
            m.put(arr[i],m.getOrDefault(arr[i],0)+1); // counting occurrence of each element
        }
        System.out.println(m.size() +" ");

        for(int i = k; i<arr.length;i++){
            m.put(arr[i-k],m.get(arr[i-k])-1);

            if(m.get(arr[i-k])==0)
            {
                m.remove(arr[i-k]);
            }
            m.put(arr[i],m.getOrDefault(arr[i],0)+1);
            System.out.println(m.size()+" ");
        }




    }
}
