package Problems;

public class maxProductSubArray {
    public static void main(String[] args) {
        int arr[] ={1,2,-3,0,5};
        int mult = 1;
        int max = 0;

        for(int i =0 ; i<arr.length;i++){
            mult = 1;
            for(int j = i ; j < arr.length;j++){
                if(arr[j] == 0){
                    mult=mult*1;
                }else {
                    mult = mult*arr[j];
                }

            }
            max = Math.max(max,mult);
        }

        System.out.println("Max product of subArray:"+max);
    }
}
