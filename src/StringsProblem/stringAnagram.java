package StringsProblem;

public class stringAnagram {
    public static void main(String[] args) {
        String a = "abc";
        String b = "cab";
        boolean isAnagram = false;

        boolean[] Visited = new boolean[b.length()]; // this array is used to keep note of visited character

        for(int i = 0 ; i < a.length(); i++){
            char c = a.charAt(i);
            isAnagram = false;
            for(int j = 0; j< b.length(); j++){
                if(b.charAt(j) == c && !Visited[j]){ // if char is not visited
                    isAnagram = true;
                    Visited[j] = true;
                    break;
                }
            }
            // no match found loop will break
            if(!isAnagram){
                break;
            }
        }
        if (isAnagram){
            System.out.println("Anagram");
        }
        else {
            System.out.println("Not Anagram");
        }
    }
}
