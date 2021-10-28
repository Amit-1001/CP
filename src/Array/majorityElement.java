package Array;

public class majorityElement {
//
    // majority element means its count should be greater than n/2 n= size of array
// this algorithm work in two phase first phase find the majority element in array
    // second phase verifies that if this element is majority or not
    static int findMajorityIndex(int[] arr){
        int index = 0;// initially considering arr[0] is majority element
        int count=1;
        for(int i = 1; i<arr.length; i++){
            if(arr[index]==arr[i]){ // if element found increment count
                count++;
            }
            else {
                count--; // different element is sound decrement count

            }
            if(count==0){ // once count is zero start new count and store in element in index;
                index =i;
                count=1;
            }
        }

        return index;
    }
    public static void main(String[] args) {
        int [] arr = {3,2,3};

        int index = findMajorityIndex(arr); // this finds the majority element in array
        int count = 0;
        for(int i = 0; i< arr.length ; i++){ // this check if obtained element is majority element or not
            if(arr[index]==arr[i]){
                count++;
            }
        }
        if(count<=arr.length/2){
            System.out.println(-1);
            System.exit(0);
        }
        System.out.println("Index of majority Element is :"+index);
    }
}
