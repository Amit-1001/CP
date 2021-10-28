package Mathematics;

public class multiplicationUnderModulo {
    public static void main(String[] args) {
        long M = 1000000007; // this is modulo which is used to reduce large number into small one
        // large number are stored as string
        String a ="92233720368547758";
        String b = "92233720368547758";
        long A = (Long.parseLong(a))%M;
        long B = (Long.parseLong(b))%M;
        // same goes for addition
        System.out.println((A*B)%M);
    }

}
