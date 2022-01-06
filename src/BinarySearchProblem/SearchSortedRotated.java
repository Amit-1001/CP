package BinarySearchProblem;


public class SearchSortedRotated {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};

        int res = findPosition(arr,6);

        System.out.println("Found at postion:"+res);
    }

    private static int findPosition(int[] arr, int data) {
        int size =arr.length;
        int pivot = getPivot(arr,size);

        if(data >= arr[pivot] && data <= arr[size-1]){
            // if pivot is less than given number and less than size of array it means we need to search in right side of array
            return binarySearch(arr,pivot,size-1, data); // move in right side array
        }
        else{
            return  binarySearch(arr, 0 , pivot-1, data); // move in left side array
        }

    }

    private static int getPivot(int[] arr, int size) {
        int start =0;
        int end = size-1;

        while (start<end){
            int mid = start+ (end-start)/2;

            if(arr[mid] >= arr[0]){ // if 'mid' value is greater than arr[0] then we should move in right of array
                start = mid + 1;
            }
            else{
                end = mid; // else we move to 'mid' position
                // we don't use end = mid -1 because it will go in left side behind mid.
                // but in above if condition we have mentioned if that condition is false it must be in right part
            }
        }
        return start; // index of pivot
        // return start or end both are pointing to same position
    }


    public static int binarySearch(int[]arr, int start, int end , int k){


        int s = start;
        int e = end;



        while(s<=e){
            int mid = s+(e-s)/2;
            if(arr[mid]==k){
                return mid;
            }
            else if(arr[mid]> k){
                e = mid-1;
            }
            else{
                s = mid+1;
            }
        }

        return  -1;
    }

}
