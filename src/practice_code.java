import java.lang.management.ManagementFactory;
import java.sql.SQLOutput;
import java.util.*;

public class practice_code {
    public static int[] twoSum(int[] nums, int target) {

        int start =0;
        int end = nums.length-1;
        int[] res = new int[2];
        Arrays.sort(nums);


        while(start<end){
            if(nums[start]+nums[end]==target){
                res [0] = start;
                res [1] = end;
                break;
            }
            else if(nums[start]+nums[end]>target){
                end--;
            }
            else{
                start++;
            }
        }

        return res;

    }

    public static void main(String[] args) {


        String exp = "A*(B+C)/D";

        StringBuilder str = new StringBuilder();
        Stack <Character> st = new Stack<>();

        for(int i = 0;i<exp.length();i++){
            char c = exp.charAt(i);

            if(checkPrecedence(c)>0){

                while(st.isEmpty()== false && checkPrecedence(st.peek()) >= checkPrecedence(c) ){
                    str.append(st.peek());
                }
                st.push(c);

            }
            else if(c==')'){
                char x = st.pop();
                while(x!='('){
                    str.append(x);
                    x = st.pop();
                }
            }
            else if(c=='('){
                st.push('(');
            }
            else{
                str.append(c);
            }
        }

        for(int i=0; i<st.size();i++){
            str.append(st.pop());
        }

        String res = str.toString();
        System.out.println(str.toString());
    }





    public static int checkPrecedence(char c){
        switch(c){
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }

        return -1;
    }
}
