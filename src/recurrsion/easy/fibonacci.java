package recurrsion.easy;

public class fibonacci {

    static int fib(int n){
        int dig=0;
        if(n<=1){
            return  n;
        }
        //System.out.println(dig);
       return   fib(n-1)+fib(n-2);
    }
    public static void main(String[] args) {
        int num = 9;

        System.out.println(fib(num));
    }
}
