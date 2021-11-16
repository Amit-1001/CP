package recurrsion.easy;

import java.util.ArrayList;

public class returnListOfPermutation {
    public static void main(String[] args) {
        String str = "ABC";

        ArrayList<String> res = printPermutaion(str,"");

        System.out.println(res);
    }

    private static ArrayList<String> printPermutaion(String str, String Ans) {
                if(str.isEmpty()){
                    ArrayList<String> ans = new ArrayList<>();
                    ans.add(Ans);
                    return  ans;
                }

                char ch = str.charAt(0);
                ArrayList<String> list = new ArrayList<>();

                for(int i =0; i<=Ans.length();i++){ // here less than equal to is important as initially Ans is empty
                    String left = Ans.substring(0,i);
                    String right = Ans.substring(i,Ans.length());

                    list.addAll(printPermutaion(str.substring(1),right+ch+left));
                    // here we are adding 'ans'(list) we got from recursive call
                }

                return list;


    }


}
