package stack;

import LinkLIst.LinkList;

import java.util.Stack;

public class infixTOPostFix {

    private static  StringBuilder sb = new StringBuilder();
    private static Stack<Character> st = new Stack<>();
    public static void main(String[] args) {
        String str = "(1)+8";

        for(int i=0; i<str.length();i++){
            char c = str.charAt(i);
            if(checkPrecidence(c)>0){

                while (st.isEmpty()==false && checkPrecidence(st.peek())>=checkPrecidence(c)){
                    sb.append(st.pop());
                }
                st.push(c);
            }
            else if (c==')'){
                char x = st.pop();
                while (x!='('){
                    sb.append(x);
                    x = st.pop();
                }
            }

            else if(c=='('){
                st.push('(');
            }
            else{
               sb.append(c);
            }
        }

        for(int i =0; i<=st.size();i++){
            sb.append(st.pop());
        }

        System.out.println(sb.toString());
    }

    private static int checkPrecidence(char c) {
        // preceding of operator
        switch(c){
            case '+': // + has more precedence over -
            case '-':
               return 1;
            case '*': // * has more precedence over / + -
            case '/':
            return 2;

            case '^':
              return 3;
        }
        return -1;

    }

}
