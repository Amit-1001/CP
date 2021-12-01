import com.sun.source.tree.Tree;

import java.lang.management.ManagementFactory;
import java.sql.SQLOutput;
import java.util.*;

public class practice_code {




    public static void main(String[] args) {
        Scanner  in = new Scanner(System.in);
        Stack <Character> st = new Stack<Character>();
        String str = in.nextLine();

        if(str.isEmpty()){
            System.out.println("true");
            return;
        }

        System.out.println(str.charAt(str.length()-1));

        for(int i = str.length()-1;i>=0;i--){
            char c = str.charAt(i);
            if(c == '(' || c == '{' || c == '['){

                if(c == st.peek()){
                    st.pop();
                }
            }else if( c==')' || c == '}' || c== ']'){
                st.push(c);
            }
        }

        if(!st.isEmpty()){
            System.out.println("false");
        }
        else {
            System.out.println("true");
        }

    }




}
