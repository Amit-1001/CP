package javaCollection;
import java.util.*;
public class arrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>(); // we always use non-primitive data types while declaring collection

        list.add(20);
        list.add(1,30);
        list.add(40);
        list.add(0,10);
        list.add(0,5);// this will shift list to right and add 5 at beginning
        list.add(30);
        Iterator<Integer> read = list.iterator();

        while (read.hasNext()) {

            System.out.println(read.next());

        }
String[] s ={"abc","de"};
        String[] s1 ={"ab","cde"};


        System.out.println(list.toString());

        System.out.println("Last Index of 30:"+list.lastIndexOf(30));

        System.out.println("List contains 20:"+list.contains(20));

    }
}
