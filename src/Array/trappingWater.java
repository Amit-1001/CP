package Array;

public class trappingWater {
    public static void main(String[] args) {
        int[] arr = {3,0,1,2,5};
        int max=0;
        //int lmax = 0;
        //int rmax = 0;
        int res = 0;

        /// time complexity is O(n^2);
//        for(int i = 1; i<arr.length-1; i++){ // we have to find capacity between first and last element
//            // that is why i =1 and i<arr.length
//            for (int j = 0; j<i;j++){
//                lmax = Math.max(lmax,arr[j]);
//            }
//
//            for(int j = i+1;j<arr.length;j++){
//                rmax = Math.max(rmax,arr[j]);
//            }
//            res = res+(Math.min(lmax,rmax)-arr[i]);
//        }
//        System.out.println(res);


        //Better complexity O(n)
int n = arr.length; // size of array
        int[] lmax = new  int[n];
        int[] rmax = new int[n];
        lmax[0] = arr[0];
        for (int j = 1; j<n;j++){
                lmax[j] = Math.max(arr[j],lmax[j-1]);
            }
        rmax[n-1] = arr[n-1];
            for(int j = n-2;j>=0;j--){ // started from end
                rmax[j] = Math.max(arr[j],rmax[j+1]);
            }

            for(int i =1 ; i< n-1;i++){
                res = res+Math.min(lmax[i],rmax[i])-arr[i]; // minimum between left_max and right_max value current element is subtracted
                // and added to previous res which gives capacity
            }
        System.out.println(res);

    }


    ///
}
