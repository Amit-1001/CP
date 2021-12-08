package BacktTracking;

import java.util.Scanner;

public class mazePathWithJumps {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();

        printMazePaths(1,1,n,m,"");
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static void printMazePaths(int sr, int sc, int dr, int dc, String psf) {

        if(sr==dr && sc==dc){
            System.out.println(psf);
        }

        for(int step = 1; step <= dc-sc;step++){ // going column wise
            printMazePaths(sr,sc+step,dr,dc,psf+"h"+step); // moving horizontally
        }

        for(int step = 1; step <=dr-sr; step++){
            printMazePaths(sr+step,sc,dr,dc,psf+"v"+step); // moving vertically
        }

        for(int step = 1; step<=dr-sr && step<= dc-sc; step++){
            printMazePaths(sr+step,sc+step,dr,dc,psf+"d"+step); // moving diagonally
        }



    }
}
