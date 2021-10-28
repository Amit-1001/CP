package Mathematics;

public class oddOccurring {
    public static void main(String[] args) {
        int[] arr = {4,3,4,4,5,5,4,3,1};
        int res = 0;

        for(int i = 0 ; i<arr.length; i++){
            res = res^arr[i];
        }
        System.out.println(res);
    }
}
