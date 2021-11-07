package recurrsion;

public class LetterCombination {
    public static void main(String[] args) {
        String str = "12";

        printLetter(str,"");
    }


    public static void printLetter(String str,String Ans){
        if(str.isEmpty()){
            System.out.println(Ans);
            return;
        }
        char ch = str.charAt(0);

        int digit = ch - '0'; // taking one by one charater from string

       // System.out.println("Digit:"+digit);

        for(int i=(digit-1)*3; i<digit*3; i++){
            char letter = (char) ('a'+i);
            printLetter(str.substring(1),Ans+letter);
        }
    }
}
