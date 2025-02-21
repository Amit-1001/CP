package BacktTracking;

import java.util.Scanner;

public class floodFill {
    public  static int[][] dir = {{0,1},{1,0},{1,1}}; // three direction horizontal , vertical , diagonal
    public static String[] dirS = {"h","v","d"};
    /**
     *      0,1 : horizontal
     *      1,0 : vertical
     *      1,1 : diagonal
     *
     *      for 4 direction
     *      -1,0 : top
     *      0,1 : right
     *      0,-1 : left
     *      1,0 : down
     *
     * */

    public static void main(String[] args) {
        int[][] maze = {{0,0,1},
                        {0,0,0},
                        {1,0,0}};

       // floodFillM1(maze,0,0,3,3,"");
        floodFillM2(maze,0,0,3,3,"");
    }

    private static void floodFillM2(int[][] maze,int sr,int sc, int dr, int dc, String s) {
        if(sr >= dr || sc>= dc || maze[sr][sc] == 1){
            return;
        }
        if(sr == dr-1 && sc == dc-1){
            System.out.println(s);
            return;
        }
        maze[sr][sc] = 1;

        // this uses dirS and dir
        for(int d =0; d<dirS.length; d++){ // three direction is allowed
            int r = sr+dir[d][0];
            int c = sc+dir[d][1];

                floodFillM2(maze, r, c, dr, dc, s + dirS[d]);

        }
        maze[sr][sc] = 0;
    }

    private static void floodFillM1(int[][] maze,int sr,int sc, int dr, int dc, String s) {

            if( sc >=3 || sr >=3 || maze[sr][sc] == 1){
                return;
            }

        if(sr == 2 && sc == 2){
            System.out.println(s);
            return;
        }
            maze[sr][sc] = 1;

        if(sc<dc ) {
            floodFillM1(maze, sr , sc+1, dr, dc, s+"h");
        }
        if(sr<dr ) {
            floodFillM1(maze, sr+1, sc, dr, dc,  s+"v");
        }
        if(sc<dc && sr < dr){
            floodFillM1(maze, sr+1, sc+1, dr, dc,  s+"d");
        }



            maze[sr][sc] = 0;
    }

}
