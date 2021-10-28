package Sorting;

import java.util.Arrays;

public class cyclDistinctSort {
    static void cycleSort(int[] arr){
            for(int cs =0; cs< arr.length-1;cs++){
                int item = arr[cs];
                int pos = cs;

                for(int i = cs+1; i<arr.length; i++){
                    if(arr[i]<item){
                        pos++;
                    }
                }

                int temp = item;
                item = arr[pos];
                arr[pos] = temp;

                while (pos!=cs){
                    pos = cs;

                    for(int i = cs+1; i<arr.length;i++){
                        if(arr[i]<item){
                            pos++;
                        }
                    }
                    temp = item;
                    item = arr[pos];
                    arr[pos] = temp;
                }


            }
    }

    public static void main(String[] args) {
        int[] arr = {10,30,20,50,40};

        cycleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
