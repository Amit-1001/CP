package recurrsion;

public class stringSubset {
// time complexity is 2^n
    static void printSub(String str, String curr, int index)
    {
        if(index == str.length()) // when subset is of string length then print that set
        {
            System.out.println(curr);
            return;
        }
        printSub(str, curr+str.charAt(index), index + 1); // here we are taking current character
        //System.out.println("index value after above recursion"+index);
        printSub(str, curr, index + 1); // here we are not taking current character

    }
    public static void main(String[] args) {
        String str = "ABC";
        printSub(str,"",0);

    }
}
