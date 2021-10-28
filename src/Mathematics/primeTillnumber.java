package Mathematics;

import java.lang.reflect.Array;
import java.util.Arrays;

public class primeTillnumber {
    public static void main(String[] args) {
        int num = 23;
        boolean [] isPrime = new boolean[num+1];

        Arrays.fill(isPrime,true); // initializing all value to true




        for(int i = 2;i*i<=num;i++){
            if(isPrime[i]) {
                for (int j = 2 * i; j <= num; j = j + i) { // this will find all multiple of i
                    // if we want to optimize even further can set j = i*i;
                    isPrime[j] = false; // marking all multiple of i as false
                }
            }
        }

        for (int i = 2; i <=num; i++) {
            if(isPrime[i]){
                System.out.println(i);
            }
        }
    }
}
