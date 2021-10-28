package Mathematics;

public class optimizeLCM {
    // LCM is smallest number which can be divide by both number
    public static int gcd(int a, int b) {
        if(b==0){
            return a;
        }
        else
            return gcd(b,a%b);
    }
    public static int LCM(int a,int b){

        return (a*b)/gcd(a,b); // formula
    }

    public static void main(String[] args) {
        System.out.println("LCM:"+LCM(4,6));
    }
}
