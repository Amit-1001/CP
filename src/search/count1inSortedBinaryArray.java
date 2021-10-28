package search;

public class count1inSortedBinaryArray {
    static int count_One(int[] arr){
        int n = arr.length;
        int start = 0;
        int end = n-1;
        while (start<=end){
            int mid = start + (end - start)/2;

            if(arr[mid] == 0){ // if zero is encountered search in right side
                start = mid+1;

            }
            else {
                if(mid ==0 || arr[mid]!=arr[mid-1]){ // if previous element of arr[mid] is not 0 then its first occurrence of 1
                    return (n-mid); // mid will be the first occurrence of one as array is sorted
                    // size of array - first occurrence of 1 = total number of 1
                }
                else {
                    end = mid-1; // if previous element of arr[mid] is equal to 1 then keep searching in left
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int [] arr = {0,0,1,1,1,1};
            // this works on when array is sorted
        System.out.println("No of one in array:"+count_One(arr));

    }
}
