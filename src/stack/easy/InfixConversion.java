package stack.easy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class InfixConversion {
    /**
     *          Input: a*(b-c+d)/e
     *          output:
                         abc-d+*e/ (Postfix)
                         /*a+-bcde  (Prefix)
     *
     *
     *
     * **/

    public static int precedence(char c){
        if(c == '+' || c == '-'){
            return 1;
        }else{
            return 2;
        }
    }

    public static String calPostfix(String str){
        Stack<String> postFix = new Stack<>();
        Stack<Character> op = new Stack<>();


        for(int i=0; i<str.length(); i++){
            char c = str.charAt(i);

            if(c == '('){
                op.push(c);
            }
            else if( c == '+'|| c == '-' || c == '*' || c == '/'){
                while(op.size() != 0 && op.peek() != '(' && precedence(op.peek()) >= precedence(c)){
                    String v2 = postFix.pop();
                    String v1 = postFix.pop();

                    char o = op.pop();

                    String result = v1 + v2 + o ; // operand1 + operand2 + operator

                    postFix.push(result);
                }
                //op.pop();
                op.push(c);
            }
            else if(c == ')'){
                while( op.peek() != '('){
                    String v2 = postFix.pop();
                    String v1 = postFix.pop();

                    char o = op.pop();

                    String result = v1 + v2 + o; // operand1 + operand2 + operator

                    postFix.push(result);
                }
                op.pop();
            }else{
                postFix.push(c+"");
            }
        }

        while(op.size() != 0){
            String v2 = postFix.pop();
            String v1 = postFix.pop();

            char o = op.pop();

            String result = v1 + v2 + o; // operand1 + operand2 + operator

            postFix.push(result);

        }

        return postFix.peek();


    }



    public static String calPrefix(String str){
        Stack<String> preFix = new Stack<>();
        Stack<Character> op = new Stack<>();


        for(int i=0; i<str.length(); i++){
            char c = str.charAt(i);

            if(c == '('){
                op.push(c);
            }
            else if( c == '+'|| c == '-' || c == '*' || c == '/'){
                while(op.size() != 0 && op.peek() != '(' && precedence(op.peek()) >= precedence(c)){
                    String v2 = preFix.pop();
                    String v1 = preFix.pop();

                    char o = op.pop();

                    String result = o + v1 + v2 ; // operator + operand1 + operand2


                    preFix.push(result);
                }
                //op.pop();
                op.push(c);
            }
            else if(c == ')'){
                while( op.peek() != '('){
                    String v2 = preFix.pop();
                    String v1 = preFix.pop();

                    char o = op.pop();

                    String result = o + v1 + v2; // operator + operand 1 + operand 2

                    preFix.push(result);
                }
                op.pop();
            }else{
                preFix.push(c+"");
            }
        }

        while(op.size() != 0){
            String v2 = preFix.pop();
            String v1 = preFix.pop();

            char o = op.pop();

            String result = o + v1 + v2 ; // operator + operand 1 + operand 2

            preFix.push(result);

        }

        return preFix.peek();

    }


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String exp = br.readLine();

        // code

        String postfix = calPostfix(exp);
        String prefix  = calPrefix(exp);

        System.out.println(postfix);
        System.out.println(prefix);

    }
}
