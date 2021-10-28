package Problems;

import java.util.Arrays;

public class MergeArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(m ==0 && n==1){
            System.out.println(m+n);
        }

        int result[] = new int[m+n];

        for(int i = 0 ;i<m;i++){
            result[i] = nums1[i];
        }
        int len = result.length;
        int j =0;
        for(int i = m ;i<len;i++){
            result[i] = nums2[j];
            j++;
        }




        Arrays.sort(result);
        System.out.printf("%s",
                Arrays.toString(result));
    }
    public static void main(String args[]){
        MergeArray obj = new MergeArray();
        //Scanner in = new Scanner(System.in);
        int[] nums1 = {1,2,3};
        int[] nums2 = {2,5,6};
        obj.merge(nums1,3,nums2,3);
    }

}
