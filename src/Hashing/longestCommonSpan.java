package Hashing;

import java.util.HashMap;

public class longestCommonSpan {
    public static void main(String[] args) {
            int [] arr1 = {0,1,0,0,0,0};
            int [] arr2 = {1,0,1,0,0,1};

            int sum =0;
            int result =0;
            int pre_sum = 0;
            int max = 0;

        HashMap<Integer, Integer> m = new HashMap<>();
        int[] temp = new int[arr1.length];

        for(int i =0 ; i< arr1.length;i++){
            temp[i] = arr1[i] - arr2[i];
        }

        for (int i =0 ; i< arr1.length; i++){
            pre_sum = pre_sum+temp[i];

            result = pre_sum - sum;

            if(pre_sum == sum){
                max = i+1;
            }
            if(!m.containsKey(result)){
                m.put(pre_sum,i);
            }
            if(m.containsKey(result)){
                max = Math.max(max , i - m. get(result));
            }
        }

        System.out.println(max);
    }
}
