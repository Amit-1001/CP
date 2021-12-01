package recurrsion;

import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.Arrays;

public class maze {
    // return all possible path from a to b

//     3 2 1    // consider this as matrix we are starting from (3,3) and we have to find path till (1,1)
//   3 0 0 0
//   2 0 0 0
//   1 0 0 0


    public static void main(String[] args) {
        int r = 3, c = 3; // starting position 'a'

        System.out.println("Possible path from :("+r+","+c+") to (1,1) is:"+path(r,c));

        // return path
        System.out.println("All possible path are");
        pathFinder(r,c,"");


        // return Array of all possible path
        ArrayList<String > res;
        System.out.println("Path in form of List:");
        res = pathFinderList(r,c,"");
        System.out.println(res);

        // use vertical, horizontal, and diagonal approach
        ArrayList<String> diaRes;

        diaRes = pathFindDig(r,c,"");
        System.out.println(diaRes);



    }

    private static ArrayList<String> pathFindDig(int r, int c, String s) {
        if(r == 1 && c == 1){
            ArrayList<String> res = new ArrayList<>();
            res.add(s);
            return res;
        }
        ArrayList<String> digRes = new ArrayList<>();
        if(r > 1 && c > 1){
            digRes.addAll(pathFindDig(r-1,c-1,s+"D")); // moving diagonally
        }

        if(r>1){
                digRes.addAll(pathFindDig(r-1,c,s+"V")); // going vertically
        }

        if(c>1){
            digRes.addAll(pathFindDig(r,c-1,s+"H")); // going Horizontally
        }
        return digRes;
    }

    private static ArrayList<String> pathFinderList(int r, int c, String s) {
        if(r == 1 && c == 1){
            ArrayList<String> res = new ArrayList<>();
            res.add(s);
            return  res;
        }

        ArrayList<String> foundPath = new ArrayList<>();

        if(r > 1){
            foundPath.addAll(pathFinderList(r-1,c,s+"D"));
        }
        if( c > 1){
            foundPath.addAll(pathFinderList(r,c-1,s+"R"));
        }

        return foundPath;
    }

    private static void pathFinder(int r, int c, String s) {
        if(r == 1 && c == 1){
            System.out.println(s);
            return;
        }

        if(r > 1){
            pathFinder(r-1,c,s+"D");
        }
        if( c > 1){
            pathFinder(r,c-1,s+"R");
        }

    }

    private static int path(int r, int c) {

        if(c == 1 ||  r == 1){
            return 1;
        }

        int left = path(r-1,c); // going downward
        int right = path(r , c-1); // going in right side

        return left+right;
    }
}
