package Mathematics;

public class GrayToBin {
    public static void main(String[] args) {
        int inv = 0;
            int n =15;
        // Taking xor until n becomes zero
        for ( ; n != 0 ; n = n >> 1)
            inv ^= n;

        System.out.println(inv);
    }
}
