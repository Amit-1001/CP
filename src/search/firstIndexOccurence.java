package search;

public class firstIndexOccurence {
    static int firstOccurrence(int[] arr, int key){
        int start = 0;
        int end = arr.length-1;

        int mid = start +(end-start)/2;

        while (start<=end){
            mid = start + (end - start)/2;


            if(arr[mid]<key){ // search in right
                start = mid+1;
            }
            else if(arr[mid]>key) // search in left
                end = mid-1;

            else{
                if(mid==0 || arr[mid-1]!=arr[mid]){ // checking if arr[mid] is not equal to previous of mid
                    // if mid is at first position no need to check previous element current element is first occurrence
                    return mid;
                }
                else {
                    end = mid-1; // search in left
                }
            }
        }
        return 0;

    }
    public static void main(String[] args) {
        int[] arr = {10,10,20,30,40,40};
        int key =10;
        System.out.println("first occurrence of number at Position:"+firstOccurrence(arr,key));
    }
}
