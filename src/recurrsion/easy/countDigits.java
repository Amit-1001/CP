package recurrsion.easy;

public class countDigits {
    static int count(int n){
        if(n/10==0){
            return 1;
        }
        return 1+count(n/10);
    }
    public static void main(String[] args) {
        int num=99990;
        System.out.println(count(num));
    }
}
