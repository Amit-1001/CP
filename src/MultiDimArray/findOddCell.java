package MultiDimArray;

public class findOddCell {
    public static int oddCells(int m, int n, int[][] indices) {


        int c =0;
        int[][] ans = new int[m][n];

        int r = indices.length;
        int row = 0;
        int col =0;
        for(int i=0; i<r; i++) {
            for(int j=0; j<2;j++){
                row=indices[i][j];
                for(int k = 0; k < n; k++)
                {
                    ans[row][k]++;
                }
                j++;

                col=indices[i][j];

                for(int l = 0;l < m;l++)
                {
                    ans[l][col]++;
                }
            }
        }

        for(int p = 0; p < m; p++) {
            for(int q=0;q<n;q++)
                if(ans[p][q]%2!=0)
                    c++;
        }
        return c;
    }

    public static void main(String[] args) {
        int m =2,n=3;

        int [][] indices= {{0,1},{1,1}};
        System.out.println(oddCells(m,n,indices));
        }
}
