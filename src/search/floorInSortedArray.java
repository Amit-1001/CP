package search;

public class floorInSortedArray {
    static int findFloor(int arr[], int n, int x)
    {
        int start = 0;
        int end = n-1;

        int result = 0;
        int max =-1;

        while(start<=end){
            int mid = start + (end - start)/2;
            if(arr[mid]==x){
                return mid;
            }

            else if(arr[mid]<x){
                start = mid+1;
                if(arr[mid]>max && max <x){
                    max = mid;
                }
            }
            else{
                end = mid-1;
            }

        }

        return max;
    }

    public static void main(String[] args) {
        int [] arr = {1,2,8,10,11,12,19};
        int data = 9;

        System.out.println(findFloor(arr,arr.length,data));

    }
}
