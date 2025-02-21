package StringsProblem;

import java.util.Scanner;

public class stringAnagram {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        while(t--!=0) {
            String a = in.next();
            String b = in.next();
            boolean isAnagram = false;

            boolean[] Visited = new boolean[b.length()]; // this array is used to keep note of visited character

            for (int i = 0; i < a.length(); i++) {
                char c = a.charAt(i);
                isAnagram = false;
                for (int j = 0; j < b.length(); j++) {
                    if (b.charAt(j) == c && !Visited[j]) { // if char is not visited && if c is found in b
                        isAnagram = true;
                        Visited[j] = true;
                        break;
                    }
                }
                // no match found loop will break
                if (!isAnagram) {
                    break;
                }
            }
            if (isAnagram) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
