package Array;

import java.util.Arrays;

public class rotateArrayByD {
    // time complexity is O(n)

    //https://youtu.be/8RErc0VXAo8

    public static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    public static  void reverse(int [] arr, int low,int high){
        while (low<high){
            swap(arr,low,high);
            low++;
            high--;
        }

    }


    public static void main(String[] args) {

        // time complexity is O(n);
        int [] arr = {1,2,3,4,5,6,7};
        // this is rotation to left

        int n = arr.length;
        int rotate =3;

        reverse(arr,0,rotate-1); // reverse array till rotate-1
        reverse(arr,rotate,n-1); //reverse array from rotate position till end
        reverse(arr,0,n-1); // reverse entire array

        // to rotate right change above sequence as
        // reverse(arr,start,end-1)
        // reverse(arr,start,rotate-1);
        //reverse(arr,rotate,end-1)
        System.out.println(Arrays.toString(arr));


        /// when element are huge and negative use below
//
//        k = k%a.length;  // k is huge thats why used modules to reduce number
//        if(k<0){ // when k is negative
//            k =k+a.length;
//        }
//          int start =0;
//           int end = a.length-1;
//
//
//        reverse(a,0,end-k); // starting till first k elements are reversed;
//
//        reverse(a,end-k+1,end); // from k+1 till last element all element are reversed;
//
//        reverse(a,0,end); // starting till end element are reversed


    }
}
