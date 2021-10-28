package Array;

import java.util.Arrays;

public class RearrangeSortedArray {
    /*Given a sorted array of positive integers. Your task is to rearrange  the array elements alternatively i.e
    first element should be max value, second should be min value, third should be second max,
     fourth should be second min and so on.*/
    public static void main(String[] args) {
     int[] arr = {1,2,3,4,5,6};
     int n = arr.length;
     int maxEle = arr[n-1]+1;
     int maxIndex = n-1;
     int minIndex = 0;


     // mathematical formula
     for(int i =0 ; i< n; i++){
         if(i%2==0){
             arr[i] = arr[i] + (arr[maxIndex]%maxEle)*maxEle;
             maxIndex--;
         }
         else{
             arr[i] = arr[i] + (arr[minIndex]%maxEle)*maxEle;
             minIndex++;
         }
     }

     for (int i =0 ; i<n;i++){
         arr[i] = arr[i]/maxEle;
     }

        System.out.println(Arrays.toString(arr));
    }
}
