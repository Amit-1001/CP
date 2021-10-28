package Hashing;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class frequenciesInArray {
    public static void main(String[] args) {
        int [] arr ={10,10,20,40,50,50,30};

        HashMap<Integer, Integer> m = new HashMap<>();

        for(int x :arr){
            m.put(x,m.getOrDefault(x,0)+1);
            // m.getOrDefault(ele,default_value); here if key is present it will add 1 to it if element is not present it will use default value
        }

        for(Map.Entry<Integer,Integer>e: m.entrySet()){
            System.out.println(e.getKey()+":"+e.getValue());
        }
    }
}
