package StringsProblem;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class matchString {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter string");
        String str = in.nextLine();

        System.out.println("Enter pattern");

        String pat = in.nextLine();


        Pattern p = Pattern.compile(pat);

        Matcher m = p.matcher(str);

        int count =0;
        while (m.find()){
            count++;
            System.out.println(m.group());
        }

        System.out.println("Match found :"+count+" times.");



    }
}
