package BacktTracking;

import java.util.ArrayList;
import java.util.SortedMap;

public class maze {
    public static void main(String[] args) {

        int r = 0, c = 0;
        boolean[][] maze ={ {true,true,true},
                            {true,true,true},
                            {true,true,true}};

        ArrayList<String> res;


  res =printPath(maze,r,c,"");

        System.out.println(res);
    }

    private static ArrayList<String> printPath(boolean[][] maze,int r, int c, String s) {

            if(r==maze.length-1 && c==maze[0].length-1){ // destination is (3,3) or (2,2)(zero indexing))
              ArrayList<String> res   = new ArrayList<>();
              res.add(s);
                return res;
            }

            ArrayList<String> path = new ArrayList<>();
            if(!maze[r][c]){ // if encounter path which is visited simply return path
                return path;
            }

            maze[r][c] = false; // visited path is set as false


            if(r < maze.length-1 ){
              path.addAll( printPath(maze,r+1,c,s+"D"));
            }

            if(c < maze[0].length-1){
              path.addAll(  printPath(maze,r,c+1,s+"R"));
            }
            if(r>0){
                path.addAll(    printPath(maze,r-1,c,s+"U"));
            }
            if(c>0){
               path.addAll( printPath(maze,r,c-1,s+"L"));
            }

            maze[r][c] = true; // backtracking once recursion is over setting all track back to true

            return path;
    }
}
