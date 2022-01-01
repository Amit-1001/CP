package Array.Medium;

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

        for(int i = 0; i < limit; i++){ // this will contain number like 0 , 1, 2 , 3, 4, ..... n
            int dec = i; // taking number one by one from limits to find binary of these elements
            String str = "";

            for(int j = arr.length-1; j >=0; j--){ // starting loop from end of array to take last element first
                int r = dec % 2; // finding reminder of dec to get binary
                dec = dec / 2;

                if(r == 0){ // if reminder is 0 print nothing

                    str = "-\t" + str;

                } else {
                    str = arr[ j ] + "\t" + str; // if reminder is 1 print jth number from array
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
