import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;


public class PractiseCode {

    public static void calValue(String exp){

        Stack<Integer> st = new Stack<>();

        for(int i=0; i<exp.length(); i++){
            char c = exp.charAt(i);

            if(c >= '0' && c <= '9'){

                st.push(c - '0');

            }else if(c == '+'){
                int var2 = st.pop();
                int var1 = st.pop();

                int result  = var1 + var2;
                st.push(result);

            }else if( c == '-'){

                int var2 = st.pop();
                int var1 = st.pop();

                int result  = var1 - var2;
                st.push(result);

            }else if( c == '*'){

                int var2 = st.pop();
                int var1 = st.pop();

                int result  = var1 * var2;
                st.push(result);

            }else{

                int var2 = st.pop();
                int var1 = st.pop();

                int result  = var1 / var2;
                st.push(result);

            }
        }

        System.out.println(st.peek());


    }

    public static void calInfix(String  exp){

        Stack<String> st = new Stack<>();

        for(int i=0; i<exp.length(); i++){
            char c = exp.charAt(i);

            if(c >= '0' && c <= '9'){
                st.push(c+"");
            }else{

                String var2 = st.pop();
                String var1 = st.pop();

                String result = "("+var1+c+var2+")";

                st.push(result);

            }
        }

        System.out.println(st.peek());

    }

    public static void calPrefix(String exp){
        Stack<String> st = new Stack<>();

        for(int i=0; i<exp.length(); i++){
            char c = exp.charAt(i);

            if(c >= '0' && c <='9'){
                st.push(c+"");
            }else{

                String var2 = st.pop();
                String var1 = st.pop();

                String result = c+var1+var2;

                st.push(result);
            }
        }

        System.out.println(st.peek());
    }



    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String exp = br.readLine();

        // code
        calValue(exp);
        calInfix(exp);
        calPrefix(exp);
    }


}
