package StringsProblem;

import java.util.Arrays;
import java.util.Collections;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class longestHitPattern {
    public static void main(String[] args) {
        String str = "hhhiiitthhithit";
        Pattern pattern = Pattern.compile("h+i+t+");
        Matcher matcher = pattern.matcher(str);


        int max = Integer.MIN_VALUE;

        while (matcher.find()){
            int len = matcher.group().length();
            System.out.println(matcher.group());
           max = Math.max(len,max);
        }

        System.out.println("Max Length of HIT :"+max);


    }
}
