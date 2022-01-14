package BinarySearchProblem;

public class lastIndexOccurrence {

    static int lastIndexFinder(int [] arr, int data){
        int start = 0; int end =arr.length-1;
        int mid = start +(end - start)/2;

        while (start<=end){
            mid   = start + (end - start)/2;

            if(arr[mid]<data){
                start = mid+1;
            }
            else if(arr[mid]>data){
                end  = mid-1;
            }
            else {
                if(mid == arr.length-1|| mid ==0 || (arr[mid]!=arr[mid+1] )){ // if mid is at last position no need to check next element as its last occurrence
                        // if arr[mid] is not same with next element  and its previous element is same then mid is  last occurrence else search in right
                    return mid;
                }
                start = mid+1; // search to right side
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        int[] arr ={1,1,1,1,3,4,6};
        int key =1;
        System.out.println("Last Index is at position:"+lastIndexFinder(arr,key));
    }
}
