package Mathematics;

public class twoPow {
    static boolean power2(int n){

        if(n==0)
            return false;

        return (int)(Math.ceil((Math.log(n) / Math.log(2)))) ==
                (int)(Math.floor(((Math.log(n) / Math.log(2)))));
        // this constant time method
    }

    static boolean power(int n){
        if (n == 0)
            return false;

        while (n != 1)
        {
            if (n % 2 != 0)
                return false;
            n = n / 2;
        }
        return true;
    }
    public static void main(String[] args) {
        int num = 6;

        if((num&(num-1))==0){ // if we add num & num - 1 then we get zero in binary else it is not power of two
            System.out.println("num is power of two");
        }
        else {
            System.out.println("num is not power of tow");
        }
        // above method won't work on long numbers

        System.out.println(power(6)); // this method work on long numbers

        System.out.println(power2(6));
    }
}
