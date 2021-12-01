package BacktTracking;

import java.util.Arrays;

public class mazePath {

    public static void main(String[] args){
        boolean[][] board = {{true,true,true},
                            {true,true,true},
                            {true,true,true}};

        int[][] path_arr = new int[board.length][board[0].length];

        path(board,0,0,"",path_arr,1);

    }

    private static void path(boolean[][] board, int r, int c, String s, int[][] path_arr, int steps) {
        if(r == board.length-1 && c == board[0].length-1){
            path_arr[r][c]=steps;
            for(int[] arr:path_arr){
                System.out.println(Arrays.toString(arr));

            }
            System.out.println(s);
            System.out.println();
            return;
        }

        if(!board[r][c]){
            return;
        }
        board[r][c] =false;
        path_arr[r][c]=steps; // each step is stored in path_arr

        if(r<board.length-1){
            path(board,r+1,c,s+"D",path_arr,steps+1);
        }
        if(c<board[0].length-1){
            path(board,r,c+1,s+"R",path_arr,steps+1);
        }
        if(r>0){
            path(board,r-1,c,s+"U",path_arr,steps+1);
        }
        if(c>0){
            path(board,r,c-1,s+"L",path_arr,steps+1);
        }

        board[r][c] = true;
        path_arr[r][c] = 0;

    }
}
