package Sorting;

import java.util.Arrays;

public class sortOddAndEven {
    static void sortEven(int[] arr){
        int i =-1;
        int j = arr.length;

        while (true){
            do{
                i++;
            }while (arr[i]%2==0);

            do{
                j--;
            }while (arr[j]%2!=0);

            if(i>=j){
                return;
            }
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

        }
    }

    public static void main(String[] args) {
        int[] arr ={12,13,15,10};


        sortEven(arr);
        System.out.println(Arrays.toString(arr));
    }
}
