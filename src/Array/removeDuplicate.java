package Array;

import java.util.Arrays;

public class removeDuplicate {
    public static void main(String[] args) {
        int[] arr ={1,1,2,3,4,4};

        int index =1;
        for(int i  = 1 ; i< arr.length; i++){
            if(arr[i]!=arr[index-1]){
                arr[index] = arr[i];
                index++;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
