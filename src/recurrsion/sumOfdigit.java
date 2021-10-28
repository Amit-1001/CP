package recurrsion;

public class sumOfdigit {
    static int sum_of_digit(int n){
        if(n==0){
            return 0;
        }
        return sum_of_digit(n/10)+(n%10);
    }
    public static void main(String[] args) {
        int num=253;
        System.out.println(sum_of_digit(num));
    }
}
