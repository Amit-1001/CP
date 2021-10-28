package MultiDimArray;

import java.util.Scanner;

public class exitPoint {
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();


        int[][] arr = new int[n][m];

        for(int i =0; i< arr.length; i++){
            for(int j=0; j<arr[i].length; j++){

                arr[i][j] = in.nextInt();
            }
        }

        int direction =0;
        int row=0;
        int col=0;


        while(true){
            direction = (direction+arr[row][col]) %n ; // we have only four direction thats why we have  used modules

            if(direction==0){ // moving in east direction
                col++;
            }
            else if(direction == 1){ // moving in south direction
                row++;
            }
            else if(direction == 2){ // moving in west direction

                col--;
            }
            else if(direction == 3){ // moving in north direction
                row--;
            }

            // now condition to stop

            if(row<0){ // if row becomes negative increase row
                row++;
                break;
            }
            else if(col<0){
                col++; // if col becomes negative increase col
                break;
            }
            else if(row == arr.length){
                row--;// wall is break
                break;
            }
            else if(col == arr[0].length){
                col--; // wall is break
                break;
            }


        }

        System.out.println(row);
        System.out.println(col);

    }
}
