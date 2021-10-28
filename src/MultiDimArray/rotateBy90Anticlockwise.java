package MultiDimArray;

public class rotateBy90Anticlockwise {
    public static void main(String[] args) {
        int[][] arr  ={{1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}};

        tranpose(arr);
        reverse(arr);





        for(int i = 0; i< arr.length;i++){
            for(int j =0 ; j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }


    }

     static void reverse(int[][] arr) {
         int j=0 ,i;
        for(i =0;i< arr.length;i++){

            int low = 0, high = arr[i].length-1; // length-1 is important

            while (low<high){
                int temp  = arr[low][i];
                arr[low][i] = arr[high][i];
                arr[high][i] = temp;

                low++;
                high--;
            }

        }
    }

    static void tranpose(int[][] arr) {

        for(int i = 0; i< arr.length;i++){
            for(int j = i+1; j<arr[i].length;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }


    }


}
