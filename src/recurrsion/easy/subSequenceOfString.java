package recurrsion.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class subSequenceOfString {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);

        String str = in.next();
        ArrayList<String> res = new ArrayList<>();

        //printSs(str,"");

       res = printSubSequence(str,"");

        System.out.println(res.toString());
    }

    private static ArrayList<String> printSubSequence(String str, String s) {
            if(str.isEmpty()){
                ArrayList<String> res=  new ArrayList<>();
                res.add(s);
                return res;
            }

                char ch = str.charAt(0);
                String repeat  = str.substring(1);

                ArrayList<String> left = printSubSequence(repeat,s);
                ArrayList<String> right = printSubSequence(repeat,s+ch);

                left.addAll(right);
                return  left;
     }

    static void printSs(String str, String ans) {
    if(str.length() ==0){
        System.out.println(ans);
        return;
    }
    char ch = str.charAt(0);
    String repeat   = str.substring(1);

    printSs(repeat,ans+ch);
    printSs(repeat,ans+"_");

    }


}
