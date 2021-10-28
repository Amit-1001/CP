package Sorting;

import java.util.Arrays;

public class sortOnes {
    static void sortOnesAndZero(int[] arr){
        int i =-1;
        int j = arr.length;

        while (true){
            do{
                i++;
            }while (arr[i]!=1);
            do{
                j--;
            }while (arr[j]!=0);

            if(i>=j){
                return;
            }
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }


    }

    public static void main(String[] args) {
        int [] arr ={0,0,1,1,0};

        sortOnesAndZero(arr);
        System.out.println(Arrays.toString(arr));
    }
}
