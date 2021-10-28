package Mathematics;

public class digitsInFactorial {
    public static void main(String[] args) {
        int N =19;
        // code here\
        long fact =1;
         long  count =0;

        for(int i =2; i<=N; i++){
            fact = fact*i;
        }
long rem;
        while(fact>0){
            //rem = fact%10;
            //System.out.println(rem);

            fact = fact/10;
            count++;

        }
        System.out.println(count);
    }
}
