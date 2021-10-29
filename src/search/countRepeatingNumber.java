package search;

import java.awt.*;

public class countRepeatingNumber {
    public static Point findRepeating(Integer arr[],int n)
    {
        //Your code here

        int low=0;
        int high=n-1;
        int diff = arr[high]-arr[low];

        int count = diff==n-1?-1:n-diff; // if all element are different then difference betn first and last element should equal tp n-1
        //n-diff will give occurrence of repeating number

        if(count==-1)
            return new Point(-1,-1);

        while(low<high){
            int mid = low+(high-low)/2;
            if(arr[mid]==arr[0]+mid){// this is only finding repeated number
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return new Point(arr[low],count);

    }



    public static void main(String[] args) {
        Point res;
        Integer[] arr = {1,2,3,4,5,5,5,5};
        res = (findRepeating(arr,arr.length));
        System.out.println(res.getX()+" "+res.getY());
    }
}
