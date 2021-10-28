package Array;

public class optimizeLeaderArray {
    public static void main(String[] args) {
        // output is always print from right to left in order to print it in left to right you have to store in new array
        int[] arr = {7,10,4,6,5,2};
        int n = arr.length;
        int curr_leader = arr[n-1]; // as last element is always leader
        System.out.println(curr_leader);
        for(int i = n-2;i>=0;i--){
            if(curr_leader<arr[i]){// if arr[i] is greater than current leader then arr[i] is leader
                curr_leader = arr[i];
                System.out.println(curr_leader);
            }
        }
    }
}
