package Mathematics;

public class primeFactor {

    public static void main(String[] args) {
        int a = 84;

        if(a<=1){
            System.out.println("Not prime");
        }
        for (int i = 2; i*i <=a; i++) {
            while (a%i==0){
                System.out.print(i+" ");
                a = a/i;
            }
        }
        if(a>1){
            System.out.println(a);
        }
    }
}
