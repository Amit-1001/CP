package Mathematics;

public class twoOddOccurring {
    public static void main(String[] args) {
        int[] num = {1,1,2,3,4,3,4,5};
        int res1 = 0,res2=0;
        int xor = 0;

        for(int i =0;i<num.length;i++){
            xor = xor^num[i]; // this will find two numbers which are not even

        }
        int Right_most_bit = xor& ~(xor-1); // this will find the right most set bit in number of xor
        for (int i =0 ; i< num.length;i++){
                if((num[i]&Right_most_bit)!=0){ //
                    res1 = res1 ^ num[i]; // this will find first number which match to right Most bit
                }
                else {
                    res2 = res2 ^ num[i]; // this will find second number
                }
        }
        System.out.println(res1+" "+res2);
    }
}
