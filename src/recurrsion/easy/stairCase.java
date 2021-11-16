package recurrsion.easy;

import java.util.Scanner;

public class stairCase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        printStairs(n,"");
    }

    private static void printStairs(int n, String s) {

        if(n==0){
            System.out.println(s);
            return;
        }
        if(n<0){
            return;
        }
        printStairs(n-1,s+1);
        printStairs(n-2,s+2);
        printStairs(n-3,s+3);
    }


    //return ArrayList
//    public static void main(String[] args) throws Exception {
//        Scanner in  = new Scanner(System.in);
//
//        int n = in.nextInt();
//
//        ArrayList<String> st = new ArrayList<>();
//        st = getStairPaths(n);
//
//        System.out.println(st.toString());
//
//    }
//
//    public static ArrayList<String> getStairPaths(int n) {
//
//        ArrayList<String> res = new ArrayList<>();
//
//        res = getStairResult(n,"");
//
//        return res;
//    }
//
//    public static ArrayList<String> getStairResult(int n, String s){
//
//        if(n == 0 ){
//            ArrayList<String> res = new ArrayList<>();
//            res.add(s);
//            return res;
//        }else if(n<0){
//            ArrayList<String> res = new ArrayList<>();
//            return res;
//        }
//
//
//
//        ArrayList<String> patter1=getStairResult(n-1,s+1);
//        ArrayList<String> patter2=getStairResult(n-2,s+2);
//        ArrayList<String> patter3=getStairResult(n-3,s+3);
//
//        ArrayList<String> result = new ArrayList<>();
//
//        result.addAll(patter1);
//        result.addAll(patter2);
//        result.addAll(patter3);
//        return result;
//
//    }

}
