package Array;

public class checkArraySorted {
    public static void main(String[] args) {
        int[] arr = {2,1,4,100};
        int index = 0;

        for(int i  = 1; i < arr.length; i++){
            if(arr[i]<arr[index]){// we can even do arr[i-1]
                System.out.println("Array is not Sorted");
                System.exit(0);

            }
            else {
                index++;
            }
        }
        System.out.println("Array is sorted");

        }
}

