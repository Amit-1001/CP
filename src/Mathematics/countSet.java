package Mathematics;

public class countSet {
    public static void main(String[] args) {
        int num=12;
        int count=0;

        while (num>0){
            if((num&1)==1){
                count++;

            }
            num = num>>1; // right shifting by 1
        }
        System.out.println(count);

        // below code is same as above
//        while (num>0){
//            if(num%2!=0){// even number has zero at end in binary
//                count++;
//            }
//            num = num/2;
//        }
    }
}
