package stack;

import java.util.Stack;

public class removeDublicate {
    //Function to remove pair of duplicates from given string using Stack.
    public static String removePair(String str)
    {
        // your code here
        Stack<Character> st = new Stack<>();

        //st.push(str.charAt(str.length()-1));

        String res = "";
        if(str.length()==0){
            return res;
        }
        int i =0;
        for( i = str.length()-1;i>=0;i--){
            if(st.isEmpty()||str.charAt(i) != st.peek() ){
                st.push(str.charAt(i));
            }
            else if(st.peek()==str.charAt(i)){
                st.pop();

            }
        }

        while(!st.isEmpty()){
            res = res + st.pop();
        }
        return res;
    }

    public static void main(String[] args) {
        String str = "aaabbaaccd";
        System.out.println(removePair(str));
    }
}
