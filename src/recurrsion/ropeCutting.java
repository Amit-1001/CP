package recurrsion;

public class ropeCutting {
    static int maxCuts(int n, int a, int b, int c)
    {
        if(n == 0)
            return 0;
        if(n <= -1)
            return -1;

        int res = Math.max(maxCuts(n-a, a, b, c),
                Math.max(maxCuts(n-b, a, b, c), maxCuts(n-c, a, b, c)));

        if(res == -1)
            return -1;

        return res + 1;// res+1 is important
    }
    public static void main(String [] args)
    {
        // problem is to find max cut in rope
        // a b c are cut value
        int n = 5, a = 2, b = 1, c = 5;

        System.out.println(maxCuts(n, a, b, c));

    }
}
