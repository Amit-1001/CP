package Sorting;

public class kthSmallest {
    public static void main (String[] args)
    {
        int arr[] = new int[]{1,2,3,4,5};

        int n = arr.length;
        int k=5;
        int index=kthSmallest(arr,n,k);

        System.out.print(arr[index]);

    }

    static int partition(int arr[], int l, int h)
    {
        int pivot=arr[h]; // lomuto partition

        int i=l-1;

        for(int j=l;j<=h-1;j++){
            if(arr[j]<pivot){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp=arr[i+1];
        arr[i+1]=arr[h];
        arr[h]=temp;
        return i+1;
    }

    static int kthSmallest(int arr[],int n,int k){
        int l=0,r=n-1;
        while(l<=r){
            int p=partition(arr,l,r);
            if(p==k-1) // if pivot is equal to k-1 position
                return p;
            else if(p>k-1)
                r=p-1; //reduce pivot index by one
            else
                l=p+1; // increment pivot index by one
        }
        return -1;
    }
}
