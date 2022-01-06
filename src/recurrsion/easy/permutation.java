package recurrsion.easy;

public class permutation {
    public static void main(String[] args) {
        String str = "abc";

        printPermutation(str,"");
    }

    private static void printPermutation(String str, String s) {
        if(str.length()==0){
            System.out.println(s);
            return;
        }



        for(int i =0; i<str.length();i++){
            char ch = str.charAt(i); // taking char one by  one

            String leftString = str.substring(0,i); // taking substring till i position of string which is left part
            String rightString = str.substring(i+1); // taking substring till end postion of string which is right part

            String remainString = leftString + rightString;

            printPermutation(remainString,s+ch);
        }
    }
}
