package recurrsion.easy;

import java.util.ArrayList;

public class stringSubset {
// time complexity is 2^n
    static void printSub(String str, String curr, int index)
    {
        if(index == str.length()) // when subset is of string length then print that set
        {
            System.out.println(curr);
            return;
        }
        printSub(str, curr+str.charAt(index), index + 1); // here we are taking current character
        //System.out.println("index value after above recursion"+index);
        printSub(str, curr+"_", index + 1); // here we are not taking current character

    }
    public static void main(String[] args) {
        String str = "ABCC";
        printSub(str,"",0);

        ArrayList<String> res = new ArrayList<>();
        res = anotherPrintSub(str,"");
        System.out.println("Subsequence of String:");
        System.out.println(res);

        System.out.println("Subset of string using loops");
        printSubsetUsingLoops(str);
    }

    // this is subset finding method
    private static void printSubsetUsingLoops(String str) {
        for(int i=0; i<str.length();i++){
            for(int j = i; j<str.length();j++){
                String sub = str.substring(i,j+1);
                System.out.println(sub);
            }
        }
    }

    // this is subsequence finding method
    private static ArrayList<String> anotherPrintSub(String str, String s) {
            if(str.isEmpty()){
                ArrayList<String> res = new ArrayList<>();
                res.add(s);
                return  res;
            }

            char c = str.charAt(0);
            String repeat = str.substring(1);

            ArrayList<String> result = new ArrayList<>();
            result.addAll(anotherPrintSub(repeat,s+c)); // taking one character
            result.addAll(anotherPrintSub(repeat,s+"_")); // not taking one character

        return result;
    }
}
