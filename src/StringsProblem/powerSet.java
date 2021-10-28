package StringsProblem;

public class powerSet {
    static void printPowerSet(String str){
// printing all power set of string
        int n = str.length();
        int number_of_set =(int) Math.pow(2,n); // this is number of sets can be generated with n length of string

        // binary representation of number is used to print set of string if bit is set then print character


        for (int i = 0; i < number_of_set; i++) {
            for (int j = 0; j < n; j++) {// this will loop till length of string
                if((i&(1<<j))!=0){ // here this looping is checking for set bit at j position
                    System.out.print(str.charAt(j)); // if set bit 1 is found print that character from string

                }

            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        String str= "abc";
        printPowerSet(str);
    }
}
