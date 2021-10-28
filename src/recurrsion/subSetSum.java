package recurrsion;

public class subSetSum {
    static int countSet(int []arr,int n,int sum){
        if(n==0){
            return (sum==0)?1:0;
        }
        return countSet(arr,n-1,sum)+countSet(arr,n-1,sum-arr[n-1]);
    }
    public static void main(String[] args) {
        int sum =25;

        int [] arr = {10,20,5,40,25};
        int n = arr.length;

        System.out.println(countSet(arr,n,sum));


    }
}
