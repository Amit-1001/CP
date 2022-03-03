import javax.xml.crypto.Data;
import java.sql.Date;
import java.util.*;


public class PractiseCode {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = "Amit Nitnaware";
        int start =0;
        int last =str.length()-1;

        char[] input = str.toCharArray();

        char[] result = new char[str.length()];

        System.out.println(String.valueOf(input));

//        for(int i=0; i<str.length(); i++){
//            if(input[i]!=' '){
//                if(input[last]==' ') {
//                last--;
//                }
//                result[i] = input[last];
//                last--;
//
//                }else{
//                result[i] = ' ';
//            }
//        }

        while (start<=str.length()-1){
            if(input[start]!=' '){
                if(input[last]==' '){
                    last--;
                }
                result[start] = input[last];
                last--;
            }else{
                result[start] = ' ';
            }
            start++;
        }

        System.out.println(String.valueOf(result));

        }






}
