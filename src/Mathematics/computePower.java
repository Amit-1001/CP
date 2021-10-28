package Mathematics;

public class computePower {
    static int optimizePower(int x,int n){
        // this function works on binary level
        int res =1;

        while (n>0){
            if(n%2!=0){// is binary 0 is found then it will not enter
                res = res*x;
            }
            x=x*x;
            n=n/2;
        }
        return res;
    }
    static int power(int x, int n)
    {
        if(n == 0)
            return 1;

        int temp = power(x, n/2);

        temp = temp * temp;

        if(n % 2 == 0)
            return temp;
        else
            return temp * x;
    }

    public static void main (String[] args) {

        int x = 3, n = 5;

        System.out.println(power(x, n));
        System.out.println("Optimize Power:"+optimizePower(x,n));

    }
}
