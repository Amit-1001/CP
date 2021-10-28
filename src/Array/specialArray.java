package Array;

public class specialArray {

    public static int countAppearance(int [] arr, int target){
        int count =0;
        for(int i = 0 ; i< arr.length;i++){
            if(arr[i]>=target){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int count = -1;
        int result = -1;
        boolean isSpecial = false;
        int[] arr = {};



        for(int i = 1 ; i <=arr.length ; i++){

            if(countAppearance(arr,i)==i){
                result = i;
            }

        }
        if (result>-1){
            System.out.println("Array is special:"+result);
        }
        else {
            System.out.println("Array is not special");
        }
    }
}
