package StringsProblem;

import java.util.Arrays;

public class reverseString {

    static void revString(String s){
        int len = s.length();
        char[] string = s.toCharArray();

        for(int i = len-1 ; i>=0; i--){
            System.out.print(string[i]);
        }

    }
    public static void main(String[] args) {
//        String test = "I am Amit!";
//
//        String result[] = test.split(" ");
//        int size =result.length;
//        String[] output = new String[size];
//        int index = 0;
//
//        for (int i = size-1 ; i>=0 ; i--){
//            output[index] = result[i];
//            index++;
//        }
//        System.out.println("Before String buffer :");
//        for(String s : output){
//            System.out.printf(s);
//        }
//
//        System.out.println("");
//        StringBuffer sb = new StringBuffer();
//        for(int i = 0 ; i< size;i++){
//            sb.append(output[i]);
//        }
//
//        String str = sb.toString();
//        System.out.println(str);

        //System.out.println(output);

        revString("Amit");

    }
}
