package Mathematics;

public class oddEvenBit {
    public static void main(String[] args) {
        int num =23;

        int even_bit = num & 0xAAAAAAAA; // A= 1010 in binary which has all even positions as set
        even_bit = even_bit>>1; // right shifting to make all even bits position to odd bits position
        int odd_bit = num & 0x55555555; // 5 = 0101 in binary which has all odd position as set
        odd_bit = odd_bit<<1; // left shifting to make all odd bits position to even bits position

        System.out.println(even_bit|odd_bit);


    }
}
