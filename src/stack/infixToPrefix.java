package stack;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Stack;

public class
infixToPrefix {
   private static Stack<Character> st = new Stack<>();
   private static StringBuilder sb = new StringBuilder();
   // private  static ArrayList<Character> sb = new ArrayList<>();
    public static void main(String[] args) {
        String str = "(x+y)*z";

        for(int i =str.length()-1;i>=0; i--){
            char c = str.charAt(i);
            if(checkPrecedence(c)>0){
                while (st.isEmpty()==false && checkPrecedence(st.peek())>=checkPrecedence(c)){
                    sb.append(st.pop());
                }
                st.push(c);
            }
            else if(c=='('){ // remember this
                char x = st.pop();
                while (x!=')'){ // remember this

                    sb.append(x);
                    x = st.pop();
                }
            }
            else if(c==')'){
                st.push(')');
            }
            else {
                sb.append(c);
            }
        }

        for(int i = 0; i<=st.size(); i++){
            sb.append(st.pop());
        }

       // Collections.reverse(sb);
        sb.reverse();
        System.out.println(sb.toString());

    }

    private static int checkPrecedence(char c) {
            switch (c){
                case '+':
                case '-':
                    return  1;
                case '*':
                case '/':
                    return  2;
                case '^':
                    return 3;

            }
            return -1;

    }
}
