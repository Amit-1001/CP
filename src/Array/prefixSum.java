package Array;

public class prefixSum {
    // this take constant time for finding sum
    static int getSum(int[] prefixSum,int l,int r){
        if(l!=0){
            return prefixSum[r] - prefixSum[l-1];
            //here l-1 means it will take sum of all element till l-1 here l starting element and r is end element
            // consider [2,8,3,9,6,5,4] if we given l = 4 it will take sum till l-1 index in prefixSum array
            // and r position is sum of all elements of array
            // Sum of all element - sum of element till l-1 we will get required sum (which is sum of elements starting from l till end)
            // remaining sum of element  between l and r will return
        }
        else {
            return prefixSum[r]; // is l is zero return r which is sum till r from 0 in prefix array
        }
    }

    public static void main(String[] args) {
        int[] arr ={2,8,3,9,6,5,4};
        int n = arr.length;
        int[] prefix_sum = new int[n]; // this will store sum till n starting from 0 to n
        // prefix will store [2,10,13,22,28,33,37]
        prefix_sum[0] = arr[0];

        for(int i = 1; i < arr.length; i++){
            prefix_sum[i] = prefix_sum[i-1] + arr[i]; // this will store sum of array by position i
        }

        // finding sum till given N in array
        System.out.println(getSum(prefix_sum,4,arr.length-1));

    }
}
