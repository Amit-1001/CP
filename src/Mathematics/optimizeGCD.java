package Mathematics;

public class optimizeGCD {

    public static int gcd(int a, int b){
            if(b == 0){ // b always be zero
                return a;
            }
            else {
                return gcd(b,a%b); // we recurred it till we get zero by modules;
            }


    }
    public static void main(String[] args) {
        int a,b;
        a = 25;
        b = 60;
        System.out.println("GCD of num:"+gcd(a,b));

    }
}
