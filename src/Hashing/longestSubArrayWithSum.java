package Hashing;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class longestSubArrayWithSum {

    public static void navieApproach(int arr[]){
        int max = 0;
        int sum = 0;
        int cal_sum =0;
        int count =0;
        for(int i = 0; i< arr.length;i++){
            cal_sum =0;
            count =0;
            for(int j =i ; j< arr.length;j++){
                cal_sum += arr[j];
                count++;
                if(cal_sum==sum){
                    if(max<count){
                        // instead of count you can also use j - i +1 which will give element present in current sub array
                        max = count;
                    }
                }
            }

        }

        System.out.println("Longest sub array with given sum is:"+max);
    }


    public static void main(String[] args) {
        int[] arr = {5,8,-4,-4,9,-2};

        int max =0;
        int sum = 0;
        int pre_sum = 0;
        int result = 0;

        Map<Integer,Integer> m = new HashMap<>();

        for(int i =0 ; i< arr.length;i++){
            pre_sum +=arr[i];
            result = pre_sum - sum;

           if(pre_sum == sum){
               max = i + 1;
           }
           if(m.containsKey(result)==false){
               m.put(pre_sum,i);
           }
           if(m.containsKey(result)){
               max = Math.max(max,i-m.get(result)); // m.get () will get index of result which is present in hashMap
               // i is index of current result
               // max is previous max
           }


        }
        System.out.println("Max length of sub array :"+max);

       // navieApproach(arr);

    }
}
