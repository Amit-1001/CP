package Array;

public class maxLengthOfSubArray {
    public static void main(String[] args) {
        // this print longest sub array which has alternative odd and even number or even and odd pattern
        // it should return longest length of such array
        int[] arr = {5,10,20,33,3,8};
        int res  = 1;
        int current = 1;
// this naive solution O(n^2);
//        for(int i=0; i<arr.length; i++){
//            int curr =1;
//            for(int j = i+1;j<arr.length;j++){
//                if((arr[j]%2==0 && arr[j-1]%2 !=0) || (arr[j]%2!=0 && arr[j-1]%2==0)){ // this check odd even pattern
//                    curr++;
//                }
//                else {
//                    break;
//                }
//            }
//            res = Math.max(res,curr);
//        }
//        System.out.println(res);


        // better approach
        for(int i =1; i< arr.length;i++){
            if((arr[i]%2==0 && arr[i-1]%2!=0) || (arr[i]%2!=0 && arr[i-1]%2==0)){
                current++;
                res = Math.max(res,current);

            }
            else{
                current =1;
            }
        }
        System.out.println("Logest subarray:"+res);
    }
}
