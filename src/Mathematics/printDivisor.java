package Mathematics;

public class printDivisor {
    public static void main(String[] args) {
        int num= 25;

        for(int i =1 ; i*i<=num ;i++){
            if(num%i==0){
                System.out.println(i);
                if(i!=num/i){// this is for printing number as 25/1 should print 25
                    System.out.println(num/i);
                }
            }

        }
    }
}
