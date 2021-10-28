package search;

public class getPeakElement {

    static int findPeak(int[] arr){
        int start = 0;
        int end = arr.length-1;
        int n = arr.length;
        while (start<=end){
            int mid = (start+end)/2;

            if(mid ==0||arr[mid-1]<=arr[mid] && (mid ==  n-1  ||arr[mid+1]<=arr[mid])){
                return  mid;
            }
            if(mid > 0 && arr[mid-1] >= arr[mid]){
                end = mid-1;
            }
            else {
                start = mid+1;
            }

        }

        return -1;
    }
    public static void main(String[] args) {
        int [] arr = {1,20,10,20,10,50};
        System.out.println("Peak is at:"+findPeak(arr));
    }
}
