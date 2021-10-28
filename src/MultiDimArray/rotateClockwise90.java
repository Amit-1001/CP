package MultiDimArray;

public class rotateClockwise90 {
    public static void main(String[] args) {
        int[][] arr  ={{1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}};
       transpose(arr);



           reverse(arr);



        for(int i = 0; i< arr.length;i++){
            for(int j =0 ; j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    static void reverse(int[][] arr) {


            for(int i=0;i<arr.length;i++){
                int left =0,right=arr.length-1;
                // swap left row to right row
                while (left<right){
                    int temp = arr[i][left];
                    arr[i][left] = arr[i][right];
                    arr[i][right] = temp;

                    left++;
                    right--;
                }
            }

    }

    static void transpose(int[][] arr) {

        for(int i =0; i<arr.length;i++){
            for(int j = i+1; j<arr[i].length;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }
}
