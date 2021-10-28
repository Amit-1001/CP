package Hashing;

import java.util.Arrays;
import java.util.HashSet;

public class logesntConsecutiveSubsequence {
    public static void main(String[] args) {

        // O(nLogn) naive solution
        int [] arr = {8,8,20,7,30};



       // Arrays.sort(arr);
        int max =0;
        int count =1;
        for(int i =1; i< arr.length;i++){
            if(arr[i]-arr[i-1] == 1){
                count++;
            }
            else if(arr[i]!=arr[i-1]){
                if(max < count){
                    max = count;
                }

                count = 1;
            }

        }

        //System.out.println("Longest Consecutive subsequence:"+max);

        //efficient way
        findLongest(arr);
    }

  static void findLongest(int[] arr) {
        // O(n) time complexity
        int res =0;
      HashSet<Integer> h = new HashSet<>();

        for(int i = 0 ; i< arr.length ;i++){
            h.add(arr[i]);
        }

        for(int i =0 ; i< arr.length;i++){
            if(h.contains(arr[i]-1) == false){ // we are checking there exist element smaller than current element
                // if exist then current element is not  starting element of subsequence
                // if not exist it means current element is starting element of subsequence and there may be subsequence starting from current element
                int count = 1;
                while (h.contains(arr[i]+count)){ // here we are finding next element which is greater than one  and find subsequence
                    count++;
                }
                res = Math.max(res,count);
            }
        }

      System.out.println("Longest consecutive subsequence is "+res);
    }
}
