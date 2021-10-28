package Problems;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteElement {

    int[] DeleteElementFromArray(int a[], int n) {
        int pos=0;
        for(int i = 0 ; i < a.length;i++){
            if(a[i]==n){
                pos = i;
            }
        }

        for(int i = (pos+1);i<a.length-1;i++){
            a[i-1] = a[i];
        }

        return a;
    }


    public static void main(String args[]) {
        int arr[];
        int size;
        int ele;
        DeleteElement obj = new DeleteElement();
        Scanner in = new Scanner((System.in));
        size = in.nextInt();
        arr = new int[size];
        for (int i = 0; i < size; i++) {
                arr[i] = in.nextInt();
        }
        System.out.println("Enter element you want to Delete:");
        ele = in.nextInt();
        System.out.println(Arrays.toString(obj.DeleteElementFromArray(arr,ele)));
    }
}
