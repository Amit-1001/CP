package search;

public class searchSortedRotatedArray {
    static int findNumber(int[] arr,int data){
        int start =0;
        int end = arr.length-1;

        while (start<=end){
            int mid = start + (end - start)/2;

            if(arr[mid] ==data){
                return mid;
            }


            if(arr[start]<=arr[mid]){ // this condition check if left half of array is sorted or not
                if(data>=arr[start] && data <= arr [mid]){ // this check if data is in between of start and middle element
                    end = mid-1; // check in left half
                }
                else {
                    start = mid+1; // check in right half
                }
            }
            
            else { // this check if right half of array is sorted
                if(data>= arr[mid] && data <=arr[end]){ // this check if data is in between middle and end element
                    start = mid+1; // check in right half
                }
                else {
                    end = mid -1; // check in left half
                }
            }

        }


        return -1;
    }


    public static void main(String[] args) {
        int[] arr ={3,1};

        System.out.println("Element present at:"+findNumber(arr,1));
    }
}
