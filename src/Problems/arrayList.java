package Problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class arrayList {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("1D array List");
        for(int i =0;i<5;i++){
            list.add(i);
        }

        ArrayList<ArrayList<Integer>> list2 = new ArrayList<>();
        // to take input we first need to initialize list

        for(int i =0;i<2;i++){
            list2.add(new ArrayList<>());// this will initialize list2 with 2D list
            // if you don't initialize this it will give error
        }
        System.out.println(list);

        System.out.println("Enter element in 2D array List");
        for(int row = 0;row <2;row++){
            for(int col = 0; col<3;col++){
                list2.get(row).add(in.nextInt());
            }
        }

        System.out.println(list2);

    }

}
