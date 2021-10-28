package Mathematics;

public class checkSet {
    public static void main(String[] args) {

        int shift =0;
        int num = 4;


        if ((num & (1 << (shift))) > 0)// indexing start from 0 if indexing is start from 1 then shift -1
            System.out.print("SET");
        else
            System.out.print("NOT SET");

    }
}
