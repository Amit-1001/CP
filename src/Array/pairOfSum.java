package Array;

public class pairOfSum {
    // array must be sorted;
    // two point approach

    public static int isPairSum(int [] arr,int size, int sum){
        int i = 0;
        int j = size-1;

        while (i<=j){
            if(arr[i]+arr[j]==sum){
                return 1;
            }
            else if(arr[i]+arr[j]<sum){ // if sum is greater increase i which will search sum in right side of array
                i++;
            }
            else {
                j--; // this is will decrease and look into left side
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        int arr[]= {1,2,3,4,5,6,8};// array should be sorted
        int size = arr.length;

        if(isPairSum(arr,size,14)==1){
            System.out.println("Sum is present in Array");
        }
        else
            System.out.println("Sum is not present in Array");
    }
}
