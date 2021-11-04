package stack;

import java.util.ArrayDeque;

public class balanceParanthesis {
    // this code do not work  for string containing alphabets
    ArrayDeque<Integer> st;
    public static void main(String[] args) {

       if(isBalanced("{([])}")){
           System.out.println("It is Balanced");
       }
       else {
           System.out.println("It is not balanced");
       }


    }

    private static boolean isBalanced(String str) {
        ArrayDeque<Character> st = new ArrayDeque<>();

        for(int i =0; i< str.length();i++){

            char c = str.charAt(i);

            if(c=='(' || c == '{' || c == '['){
              st.push(c);

            }
            else{
                char a = st.peek();
                char b = c;

                if(st.isEmpty()){
                    return true;
                }
                else if( matching(a,b)==false){
                    return false;
                }
                else{
                    st.pop();
                }
            }
        }


        return (st.isEmpty()==true);
    }

    private static boolean matching(char a, char b) {
    return ((a=='(' && b ==')')  || (a=='{' && b =='}') || (a=='[' && b ==']'));

    }




    /// below code is for string containing alphabets
//    Stack<Character> st = new Stack<>();
//        for (int i = 0; i < str.length(); i++) {
//        char ch = str.charAt(i);
//        if (ch == '(' || ch == '{' || ch == '[') {
//            st.push(ch);
//        } else if (ch == ')') {
//            if (st.size() == 0 || st.peek() != '(') {
//                System.out.println(false);
//                return;
//            } else {
//                st.pop();
//            }
//        } else if (ch == '}') {
//            if (st.size() == 0 || st.peek() != '{') {
//                System.out.println(false);
//                return;
//            } else {
//                st.pop();
//            }
//        } else if (ch == ']') {
//            if (st.size() == 0 || st.peek() != '[') {
//                System.out.println(false);
//                return;
//            } else {
//                st.pop();
//            }
//        } else {
//            // nothing
//        }
//    }
//
//        if (st.size() == 0) {
//        System.out.println(true);
//    } else {
//        System.out.println(false);
//    }
}
