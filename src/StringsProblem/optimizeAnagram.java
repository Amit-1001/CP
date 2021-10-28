package StringsProblem;

public class optimizeAnagram {
    // optimized method
     public static void main(String[] args) {
        String a = "aab";
        String b = "bca";
        boolean isAnagram = true;
        // initially all array are zero
        int[] aChar = new int[256]; // this will store repeated char
        int[] bChar = new int[256]; // 256 will take all types of char, number, special character
         // above all array has zero value as initially

        for(char c : a.toCharArray()){
            int index = (int)c; // this will store char value in integer
            aChar[index]++; // if repeated char is found index will increment // aChar[index] = aChar[index]+1;
        }

        for(char c : b.toCharArray()){
            int index = (int)c; // this will store char value in integer
            bChar[index]++; // if repeated char is found index will increment
        }

        for(int i = 0 ; i < 256 ;i++){
            if(aChar[i]!=bChar[i]){ // if char is not found with specifed repeatation will return true
                isAnagram = false;
                break;
            }
        }

        if(isAnagram){
            System.out.println("Anagram");
        }
        else {
            System.out.println("Not Anagram");
        }
    }
}
