package recurrsion;

public class stringPalindrome {
    // time complexity is O(n)
    // auxiliary space complexity O(n)

    static boolean isPalindrome(String str , int start, int end){
        if(start>=end){// when start and end comes to end both are equal string is palindrome
            return  true;
        }
        return (str.charAt(start)==str.charAt(end) && isPalindrome(str,start+1,end-1)); // corner character are checked
        // if corner character are same then it will execute second part of && which calls function and decreasing end and increasing start
    }
    public static void main(String[] args) {
        String str = "abba";
        int start = 0;
        int end = str.length()-1;


        System.out.println(isPalindrome(str,start,end));

    }
}
