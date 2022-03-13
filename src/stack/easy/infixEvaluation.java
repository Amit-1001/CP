package stack.easy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class infixEvaluation {

    /**
     *      input : 2 + 6 * 4 / 8 - 3
     *      output : 2
     *
     * */


    public static int precedence(char a){

        if(a == '+'){
            return 1;
        }else if( a == '-'){
            return 1;
        }else if(a == '*'){
            return 2;
        }else {
            return 2;
        }

    }

    public static int operation(int val1, int val2, char o){

        if( o == '+'){
            return val1 + val2;
        }else if( o == '-'){
            return val1 - val2;
        }else if( o == '*'){
            return val1 * val2;
        }else {
            return val1 / val2;
        }

    }




    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String exp = br.readLine();

        // code
        Stack<Integer> operand = new Stack<>();
        Stack<Character> operator = new Stack<>();

        for(int i=0; i<exp.length(); i++){
            char c = exp.charAt(i);

            if(c == '('){
                operator.push(c);
            }else if(Character.isDigit(c)){
                operand.push(c-'0');
            }
            else if(c == ')'){

                while(operator.peek()!='('){
                    char op = operator.pop();

                    int val2 = operand.pop();
                    int val1 = operand.pop();

                    int res = operation(val1,val2,op);

                    operand.push(res);
                }
                operator.pop();
            }
            else if(c == '+' || c == '-' || c == '*' || c == '/'){
                while(operator.size() > 0 && operator.peek()!='(' &&
                        precedence(c) <=precedence(operator.peek())){

                    char op = operator.pop();

                    int val2 = operand.pop();
                    int val1 = operand.pop();

                    int res = operation(val1,val2,op);
                    operand.push(res);
                }
                operator.push(c); // if operator stack is empty && if current operator precedence is higher than peek operator push current operetor.




            }
        }

        while(operator.size()>0){
            char op = operator.pop();

            int val2 = operand.pop();
            int val1 = operand.pop();

            int res = operation(val1,val2,op);

            operand.push(res);
        }


        System.out.println(operand.peek());
    }
}
