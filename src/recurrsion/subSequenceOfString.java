package recurrsion;

import java.util.Scanner;

public class subSequenceOfString {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);

        String str = in.next();
        printSs(str,"");

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
