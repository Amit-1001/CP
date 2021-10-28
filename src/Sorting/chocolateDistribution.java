package Sorting;

import java.util.Arrays;

public class chocolateDistribution {
    static int minDiff(int[] arr, int m){
        int res = arr[m-1] - arr[0]; // this is first set of three packets (2,3,4) in this array
        // and find difference between 4 and 2

        //(i+m-1) set of packets

        for(int i = 1; (i+m-1) < arr.length; i++){

            res = Math.min(res,(arr[i+m-1]-arr[i])); // arr[i+m-1] max value of packet and arr[i] is small value of packet
        }


        return res;
    }


    public static void main(String[] args) {
        int[] arr = {7,3,2,4,9,12,56}; // packets of chocolate
        // distribute in such way that each children get one packet and difference between max packet and minimum packet should be minimum as compare all remaining packets
        int m = 3;// number of children
        Arrays.sort(arr); // first sort array {2,3,4,7,9,12,56}

        int res = minDiff(arr,m);
        System.out.println("minimum difference between max packet and minimum packet is:"+res);
        //(2,3,4) this is set
    }
}
