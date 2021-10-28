package Mathematics;

public class countTrainlingZero {
    public static void main(String[] args) {
        int n = 251;
        int  count = 0;

        for(int i = 5 ; i<n; i=i*5){ // here we are increasing i by multiple of 5 as we want to count zero
            // considering 2,5,10 which generate zero .... only 5 generate zero when multiplied by 2 and 10
            //
            count =count+n/i;

        }
        System.out.println(count);
    }
}
