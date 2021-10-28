package Array;

public class maxDiffvalue {

    static void MaxDiff(int [] arr){
        // Maximum value of arr[j]-arr[i] such that j>i;
        // main logic behind this is finding max Difference and minValue
        // if we get minimum value from array then we can subtract that value from array element and check Difference and store max difference
        int res = arr[1] - arr[0]; // this is first difference
        int minValue = arr[0];
        for(int j = 1 ; j<arr.length;j++){

            res = Math.max(res,arr[j]-minValue); // its finding max different from array considering some random difference initially

            minValue = Math.min(minValue,arr[j]); // storing min element in minValue
        }
        System.out.println("MaxDifference from array is :"+res);
    }

    public static void main(String[] args) {
        // Maximum value of arr[j]-arr[i] such that j>i;
        int[] arr = {2,3,10,6,4,8,1};

        int maxDiff = arr[1] - arr[0];

        int n = arr.length;
        for(int i = 0; i<n-2;i++){
            for(int j = 2; j<n;j++){
                if(maxDiff<arr[j]-arr[i]){
                    maxDiff = arr[j]-arr[i];
                }
            }
        }
        System.out.println(maxDiff);
        MaxDiff(arr);


    }
}
