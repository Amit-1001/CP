package recurrsion;

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

            String leftString = str.substring(0,i);
            String rightString = str.substring(i+1);

            String remainString = leftString + rightString;

            printPermutation(remainString,s+ch);
        }
    }
}
