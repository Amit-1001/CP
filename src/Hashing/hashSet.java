package Hashing;

import java.util.HashSet;

public class hashSet {
    public static void main(String[] args) {
        HashSet<Integer> h = new HashSet<>();

        h.add(10);
        h.add(20);
        h.add(30);
        h.remove(10);
        System.out.println("Size of hash is:"+h.size());
        System.out.println("Contains:"+h.contains(20));

        System.out.println( h.add(10));
        h.add(50);

        System.out.println(h.add(10)); // this will return false as this element is already present


        for(int ele:h){
            System.out.println(ele+" ");
        }

        h.clear();

        System.out.println("Size after clear:"+h.size());


    }
}
