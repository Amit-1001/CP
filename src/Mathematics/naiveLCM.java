package Mathematics;

public class naiveLCM {
    public static void main(String[] args) {
        int a = 4;
        int b = 6;

        int min = Math.min(a,b);
        while (true){
            if(min%a==0 && min%b==0){
                System.out.println("LCM :"+min);
                System.exit(0);
            }
            min++;
        }
    }
}
