package stack.hard;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;

public class MergeInterval {
    /**
     *          E.g. Let us say there are 6 meetings
                  1 8
                  5 12
                  14 19
                  22 28
                  25 27
                  27 30
     *
     *          Then the output of merged meetings will belongs
                  1 12
                  14 19
                  22 30
     *
     *
     * */



    public static void main(String[] args) throws Exception {
        // write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][2];

        for (int j = 0; j < n; j++) {
            String line = br.readLine();
            arr[j][0] = Integer.parseInt(line.split(" ")[0]);
            arr[j][1] = Integer.parseInt(line.split(" ")[1]);
        }

        mergeOverlappingIntervals(arr);
    }

    public static void mergeOverlappingIntervals(int[][] arr) {
        // merge overlapping intervals and print in increasing order of start time

        Arrays.sort(arr,(a, b)->{
            return a[0] - b[0]; // this is lambda function sorting on base of 0 index
        });

        Stack<int []> st = new Stack<>();

        st.push(arr[0]);

        for(int i=0; i<arr.length;i++){
            int[] t = st.pop();

            int s1 = t[0];
            int e1 = t[1];

            int s2 = arr[i][0];
            int e2 = arr[i][1];

            if(s2<=e1){ // merging condition
                int em = Math.max(e1,e2);

                int[] merge = {s1,em};
                st.push(merge); // pushing merge intervel


            }else{
                st.push(t);
                st.push(arr[i]);
            }
        }

        // now poping all element and storing into 2d arr

        int [][] ans = new int[st.size()][2];

        for(int i = ans.length-1; i>=0; i--){
            int [] tmp = st.pop();
            ans[i][0] = tmp[0];
            ans[i][1] = tmp[1];
        }

        for(int i=0; i<ans.length;i++){
            for(int j =0; j<ans[0].length;j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println("");

        }



    }

}
