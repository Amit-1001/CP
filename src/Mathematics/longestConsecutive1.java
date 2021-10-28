package Mathematics;

public class longestConsecutive1 {
    public static void main(String[] args) {
        int num = 15;
        int max = 0;
        int count = 0;

        while (num>0){
            if((num&1)!=0){// and with last bit of number
                count++;

            }else {
                count=0;
            }
            if(max<count){
                    max=count;
                }
            num = num>>1;
            }
        System.out.println(max);

        }

    }

