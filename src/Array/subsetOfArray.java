package Array;

import java.util.Scanner;

public class subsetOfArray {
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i =0; i<n;i++){
            arr[i]= in.nextInt();
        }

        int limit = (int) Math.pow(2,arr.length); // if there are to n numbers in array then it has 2 raise to N subsets

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < limit; i++){
            int dec = i;
            String str = "";

            for(int j = 0; j < arr.length; j++){ // finding binary will size of arr for each number of i
                int r = dec % 2;
                dec = dec / 2;

                if(r == 0){

                    str = "-\t" + str;

                } else {
                    str = arr[ arr.length-j-1 ] + "\t" + str;
                    // arr[arr.length-j-1] will take last element from arr
                    // to start from first type arr[j]
                }
            }

            sb.append(str + "\n");
        }

        System.out.println(sb);

        //  System.out.println(sb);
    }

}
