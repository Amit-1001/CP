package Mathematics;

public class bitDifference {
    public static void main(String[] args) {
        // number of bits requied to flip
        int A=12,B=7;
        int count=0;
        int xor = A ^ B;
        while (xor>0){
            if((xor&1)==1){
                count++;
            }
            xor = xor>>1;
        }
        System.out.println("Bit needs to be flipped in A is :"+count);
    }
}
