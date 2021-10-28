package Mathematics;

public class binaryTogray {
    public static void main(String[] args) {
        int num=15;
        System.out.println("Binary TO Gray:"+(num^(num>>1)));
    }
}
