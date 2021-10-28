package Mathematics;

public class naiveGCD {
    public  static int gcd(int a,int b) {

        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;

            }


        }
        return a;// we return a as well
    }
    public static void main(String[] args) {
        int min = Math.min(6,9); // taking min number from two pair of numbers

        // this is naive approach where it uses O(min(a,b)) time complexity
        while (min!=0){
            if(6%min==0 && 9%min==0){ // if numbers divides both number then it is  GCD;
                break;
            }
            min--;
        }
        System.out.println("GCD of NUmber is :"+min);

        System.out.println("GCD of NUM using function:"+gcd(10,9));



    }
}
