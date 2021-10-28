package Array;

import java.util.Scanner;

public class negativeSubsetArray {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        int n;
        int sum=0,count=0;
        System.out.println("Enter Size of Array:");
        n = in.nextInt();
        int [ ] arr = new int[n];


        for(int i =0;i<n;i++){
            arr[i] = in.nextInt();
        }
        for(int i =0;i<arr.length;i++){
            sum = 0;// after each complete subset sum will be zero; to get individual sum of subset of array
            for(int j =i;j<arr.length;j++){

                sum += arr[j];
                if(sum<0){
                    count++;
                }
            }

        }
        System.out.println(count); // negative sum of subset of array

    }
}
