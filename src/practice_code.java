import java.lang.management.ManagementFactory;
import java.sql.SQLOutput;
import java.util.*;

public class practice_code {


    public static void main(String[] args) {
        int[] arr = {10,15,3,7};
        int k =22;

        boolean res =findK(arr,k);
        System.out.println(res);
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
