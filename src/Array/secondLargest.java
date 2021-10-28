package Array;

public class secondLargest {
    public static void main(String[] args) {
        int[] arr = {10,30,20,50};
        int res =-1;
        int largest=0;// first large element index

        if(arr.length==1){
            System.out.println("Array has only one element");
            System.exit(0);
        }
        for(int i = 1; i < arr.length; i++){
            if(arr[i]>arr[largest]){
                res = largest; // smaller element than Largest element is stored in res
                largest = i; // new large element index is stored in largest
            }
            else if(arr[i]!=arr[largest]){ // if both element are same or equal to large element ignore
                if(arr[i]>arr[res]){ // checking if current element is greater than res
                    res = i; // second large element index is stored
                }
            }
        }
        if(res==-1){
            System.out.println("ALL element are same");
            System.exit(0);
        }
        System.out.println("Second largest ele:"+arr[res]);
    }
}
