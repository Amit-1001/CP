package stack;

import java.util.Arrays;
import java.util.Scanner;

public class implementStackUsingArray {

    public static int top = -1;
    public   void insertArray(int[] arr,int i) {
        arr[++top] = i;
    }

    public static void main(String[] args) {
        implementStackUsingArray obj = new implementStackUsingArray();
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();

        int[] arr = new int[size];

        obj.insertArray(arr,10);
        obj.insertArray(arr,20);
        obj.insertArray(arr,30);
        obj.insertArray(arr,40);

        obj.topStack(arr);

    }



    private void topStack(int[] arr) {

        System.out.println(arr[top]);
    }


}
