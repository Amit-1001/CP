package stack;

import java.util.Scanner;
import java.util.Stack;

public class jumpHumpy {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int size = in.nextInt();

        int[] arr = new int[size];
        for(int i =0; i< size;i++){
            arr[i] = in.nextInt();
        }

        int res = findMaxStamina(arr);
        System.out.println(res);
    }

    public static int findMaxStamina(int[] arr){
      int[] st  = new int[arr.length];
      int size= arr.length;
      int max = arr[size-1];

      st[size-1] = arr[size-1];
      for(int i=size-2; i>=0; i--){

          for(int j = i+1; j<size; j++){
              if(arr[i]<arr[j]){
                  st[i] = arr[i] ^ st[j];
                  break;
              }
          }
          if(st[i]==0){
              st[i] = arr[i];
          }
          if(st[i]>max){
              max = st[i];
          }
      }

      return max;
    }
}
