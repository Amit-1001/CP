import java.lang.management.ManagementFactory;
import java.sql.SQLOutput;
import java.util.*;

public class practice_code {


    public static void main(String[] args) {
       int[] arr = {1,0,2,3,0};
       int index=arr.length-1;
       for(int i =arr.length-1; i>=0; i--){
           if(arr[i]==0){
               swap(arr,i,index);
               index--;
           }
       }


        System.out.println(Arrays.toString(arr));

    }

    private static void swap(int[] arr,int i, int index) {
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
    }

    private static boolean findK(int[] arr, int k) {

       Arrays.sort( arr);
       int start =0;
       int end = arr.length-1;

       while (start<end){
           if(arr[start]+arr[end]== k){
               return true;
           }
           else if(arr[start]+arr[end]<k){
               start++;
           }
           else {
               end--;
           }
       }
       return  false;
    }


}
