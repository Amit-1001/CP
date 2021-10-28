package MultiDimArray;

public class matrixSprial {

    public static void main(String[] args) {
        int[][] arr  ={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};

        int top =0,right = arr[0].length-1,bottom = arr[0].length-1,left = 0;
        // bottom is assigned the  size of row and right is assigned the size of column

        while (left<=right && top<=bottom){

            for(int i = left ; i<=right;i++){ // this for top row
                System.out.print(arr[top][i]+" ");

            }
            top++; // top is 1 now

            for(int i = top;i<=bottom;i++){ // this is for right last column
                System.out.print(arr[i][right] +" ");
            }
            right--; // right is 2 now

            if(top<=bottom){ // this is for bottom row
                for(int i = right;i>=left; i--){
                    System.out.print(arr[bottom][i]+" ");
                }
                bottom--; // bottom is 2 now
            }
            if (left <= right) { // this is for left first column
                    for(int i = bottom; i>=top ;i--) {
                        System.out.print(arr[i][left]+" ");
                    }
                    left++;
            }
            }
        }
}

