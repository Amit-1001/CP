package BinarySearchProblem;

public class ceilingNumber {
    public static int ceiling(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
        while (start<=end){
            int mid = start+ (end-start)/2;

            if(target>arr[arr.length-1]){// number greater than last element of array
                return -1;
            }

            if(target>arr[mid]){
                start = mid+1;
            }
            else if(target<arr[mid])
            {
                end = mid -1;
            }
            else {
                return mid;
            }
        }
        return start;
    }

    public static void main(String[] args){
        int[] arr = {12,22,31,45,66,77};
        int target= 86;

        int result = ceiling(arr,target);
        if(result == -1){
            System.exit(0);
        }

        System.out.println("Ceiling is: "+arr[result]);
    }
}
