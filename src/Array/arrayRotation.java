package Array;

import java.util.Arrays;

public class arrayRotation {
    static void rotateArr(int arr[], int d, int n)
    {
        // add your code here
        int temp=0;
        while(d>0){
            temp = arr[0];
            for(int i = 1 ; i<=n-1; i++){
                arr[i-1] = arr[i];
            }
            arr[n-1] = temp;
            d--;
        }
    }

    public static void main(String[] args){
        int [] arr = {10,2,3,154,5,6,7};
        int [] temp = {arr[0],arr[1]};

//        // this is 2 array rotation
//        for(int i = 2; i< arr.length; i++){
//            arr[i-2] = arr [i];
//        }
//
//
//        arr[arr.length-1] = temp[1];
//        arr[arr.length-2] = temp[0];
        arrayRotation obj = new arrayRotation();

        obj.rotateArr(arr,2,arr.length);

        System.out.println(Arrays.toString(arr));
    }
}
