package Array;

public class naiveLeaderArray {
    public static void main(String[] args) {
        //here we have to find if given number is bigger than next number if that true then number is leader
        int[] arr = {7,10,4,10,6,5,2}; // here 10 is bigger than 4 and 6 is greater than 5 also 2 is leader as there no element in front of 2

        boolean flag = false;

        for(int i = 0; i<arr.length;i++){
            flag = false;
            for(int j = i+1; j<arr.length;j++){
                if(arr[i]<=arr[j]){ // checking if next num is big then it is not leader
                    flag = true;
                    break;
                }
            }
            if(flag==false){// if next no is not then print i position element
                System.out.println(arr[i]);
            }
        }
    }
}
