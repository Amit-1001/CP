package Problems;

public class CheckIP {
    public static void main(String[] args) {
        String test ="000.12.12.034";
        boolean result = false;
        int count  = 0;
        if(test.length()>15){
            System.out.println("Not valid");
        }

        String[] Check= test.split("\\.");
        for (String s: Check){

            if(Integer.parseInt(s)<255){
                result = true;
                count++;
            }
        }
        if(count == 4 && result == true){
            System.out.println("valid IP");
        }

    }
}
