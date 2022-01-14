package Array;

import java.util.Arrays;

public class pythagoreanTriplet {
    public static void main(String[] args) {
        int[] arr = {5,12,13,4,15,16,17,3,19,20};
        int[] sq = new int[arr.length];
        for(int i=0; i<arr.length;i++){
            sq[i] = arr[i]*arr[i];
        }


        findTriplet(arr,sq);


    }

    private static void findTriplet(int[] arr, int[] sq) {
        int n = arr.length;
        int[] res = new int[3];

        Arrays.sort(arr);
        Arrays.sort(sq);

        for(int i = n-1; i>=2;i--){
            int start = 0;
            int end = i -1;

            while (start<end){
                if(sq[start]+sq[end]==sq[i]){
                    res[0] = arr[start];
                    res[1] = arr[end];
                    res[2] = arr[i];
                    System.out.println(Arrays.toString(res));
                }
                if(sq[start]+sq[end]<sq[i]){
                    start++;
                }
                else{
                    end--;
                }
            }
        }


    }
}
