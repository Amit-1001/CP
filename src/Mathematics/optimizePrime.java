package Mathematics;

public class optimizePrime {

    public static boolean isPrime(int a){
        if(a == 1){
            return false;
        }
        if(a ==2 || a ==3){
            return true;
        }
        if(a%2==0 || a%3==0){
            return false;
        }

        for (int i = 5 ; i*i <=a ; i = i+6){
            if(a%i==0 || a%(i+2)==0){ // i+2 also dividing with next number   if i = 5 then i +2 = 7
                // here we are dividing number by two numbers i and i+2
                return false;
            }
        }


        return true;
    }
    public static void main(String[] args) {

        System.out.println( isPrime(49));
    }
}
