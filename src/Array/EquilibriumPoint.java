package Array;

public class EquilibriumPoint {
    public static void main(String[] args) {
        // point where sum of element left to point is  equal to sum of element right to point
        // in the given array 20 is equilibrium
        int [] arr = {3,4,8,-9,20,6};
//
//        //naive Approch
//        int l_sum =0,r_sum=0;
//
//        for (int i =0 ; i<arr.length;i++){
//
//            l_sum =0;
//            r_sum =0;
//
//            for(int j =0;j<i;j++){
//                l_sum = l_sum +arr[j];
//            }
//            for (int k = i+1; k<arr.length;k++){
//                r_sum = r_sum + arr[k];
//            }
//            if(l_sum == r_sum){
//                System.out.println("Equilibrium found");
//                System.exit(0);
//            }
//        }
//        System.out.println("Equilibrium not found");

        System.out.println("Ans:"+efficient(arr));
    }

     static boolean efficient(int[] arr) {
        int sum =0;

        for(int i =0 ; i< arr.length;i++){
            sum = sum+arr[i];
        }
        int l_sum =0;
        for (int i =0;i<arr.length;i++){
            if(l_sum == sum - arr[i]){ //if left sum is not equal to right sum which is sum - current element
                return true;
            }
            else{
                l_sum+= arr[i]; // adding left element to left sum
                sum -= arr[i]; // element which are added to left sum is removed form main sum which gives us right sum

            }


        }

        return false;
    }
}
