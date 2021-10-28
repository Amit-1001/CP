package Sorting;

import java.util.Arrays;

public class sortNegativePositive {
    static void sortNegPos(int[] arr){
        int len = arr.length;
        int i = -1,j=len;
        while (true){
            do{
                i++;
            }while (arr[i]< 0);

            do{
                j--;
            }while (arr[j]>0);
        if(i>=j){
            return;
        }
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        }

    }


    public static void main(String[] args) {
        int [] arr = {-12,18,-10,15};

        sortNegPos(arr);
        System.out.println(Arrays.toString(arr));
    }
}
