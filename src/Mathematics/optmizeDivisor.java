package Mathematics;

public class optmizeDivisor {
    public static void main(String[] args) {
        // this will print all sorted divisor
        //Divisor always appear in pairs
        // one element is always smaller or equal to square root num itself  i <= sqrt(num) or i * i <= num
        //15 =(1,15), (3,5)
        int num = 15;
        int i;
        for(i=1; i*i<=num;i++){// this loop to find all smaller divisor of num
            if(num%i==0){
                System.out.println(i);
            }
        }

        for(;i>=1;i--){ // this loop to find all greater divisor of num
                if(num%i==0){
                    System.out.println(num/i);
                }
        }
    }
}
