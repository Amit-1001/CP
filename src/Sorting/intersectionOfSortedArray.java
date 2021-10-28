package Sorting;

public class intersectionOfSortedArray {
    static void interSection(int[] a, int[] b){
        int lenOfA = a.length;
        int lenOfB = b.length;
        int i =0,j=0;
        while (i<lenOfA && j<lenOfB){
            if(i>0 && a[i]==a[i-1]){
                i++;
                continue;
            }
            if(a[i]<b[j]){
                i++;
            }
            else if(a[i]>b[j]){
                j++;
            }
            else{
                System.out.print(a[i]+" ");
                i++;
                j++;
            }
        }
    }


    public static void main(String[] args) {
        int []a ={1,2,4,7};
        int []b ={3,4,4,6,7,8};

        interSection(a,b);

    }
}
