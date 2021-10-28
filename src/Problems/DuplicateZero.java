package Problems;

import java.util.Scanner;

public class DuplicateZero {

    void duplicateZero(int arr[]){
        int len = arr.length;
        for(int i =0;i<len;i++){
            if(arr[i]==0){
                for(int j = len-1 ;j>i;j--){ // here j > i cause it will loop only length of arr
                        arr[j] = arr[j-1]; // shifting to right
                }
                i++; // to skipping added zero
            }

        }

        for(int x :arr){
            System.out.println(x);
        }
    }
    public static void main(String args[]){
        int arr[];

        DuplicateZero obj = new DuplicateZero();
        Scanner in = new Scanner(System.in);
        int n;
        n = in.nextInt();
        arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = in.nextInt();
        }
        obj.duplicateZero(arr);


    }
}
