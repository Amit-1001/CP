package Hashing;

import java.util.HashMap;

public class longestSubarrayWithEqual0sand1s {
    public static void main(String[] args) {
        int [] arr = {1, 1, 1, 0, 1, 0, 1, 1, 1};

        int countZero=0;
        int countOne =0;
        int max = 0;

        for(int i =0; i< arr.length;i++){
            countOne =0;
            countZero =0;
            for(int j = i ; j<arr.length;j++){
                if(arr[j]==0){
                    countZero++;
                }
                if(arr[j]==1){
                    countOne++;
                }
                if(countOne == countZero){
                    if(max < countOne+countZero){
                        max = countOne+countZero;
                    }
                }
            }
        }

        //System.out.println("Longest subarray lenght with '0' and '1':"+max);


        efficient(arr);

    }

    static void efficient(int[] arr) {
        int sum =0;
        int pre_sum =0;
        int max = 0;
         int result =0;
        HashMap<Integer,Integer> m  = new HashMap<>();

        for(int i = 0 ; i<arr.length;i++){ // convert all zero with -1 and find sub array whose sum is zero
            if(arr[i]==0){
                arr[i] = -1;
            }
        }

        for(int i= 0; i<arr.length;i++){
            pre_sum = pre_sum + arr[i];

            if(pre_sum == sum){
                max = i + 1;
            }
            if(m.containsKey(pre_sum)==false){
                m.put(pre_sum,i);
            }
            if(m.containsKey(pre_sum)){
                max = Math.max(max,i-m.get(pre_sum));
            }

        }
        System.out.println("Longest subarray lenght with '0' and '1':"+max);




    }
}
