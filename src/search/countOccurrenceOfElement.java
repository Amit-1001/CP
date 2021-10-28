package search;

public class countOccurrenceOfElement {

    static int firstOcc(int arr[], int n, int x)
    {
        int start =0, end = n - 1;

        while(start <= end)
        {
            int mid = (start + end) / 2;

            if(x > arr[mid])
                start = mid + 1;

            else if(x < arr[mid])
                end = mid - 1;

            else
            {
                if(mid == 0 || arr[mid - 1] != arr[mid]) // finding first occurrence
                    return mid;

                else
                    end = mid - 1; // search to left side
            }

        }

        return -1;
    }

    static int lastOcc(int arr[], int n, int x)
    {
        int start = 0, end = n - 1;

        while(start <= end)
        {
            int mid = (start + end) / 2;

            if(x > arr[mid])
                start = mid + 1;

            else if(x < arr[mid])
                end = mid - 1;

            else
            {
                if(mid == n - 1 || arr[mid + 1] != arr[mid]) // finding last occurrence of element
                    return mid;

                else
                    start = mid + 1;
            }

        }

        return -1;
    }


    static int countOcc(int arr[], int n, int x)
    {
        int first = firstOcc(arr, n, x);

        if(first == -1) // no first element is found means element is not in array
            return 0;
        else
            return lastOcc(arr, n, x) - first + 1;// last occurrence - first occurrence + 1 is the total occurrence of element
    }

    public static void main(String args[])
    {
        // two binary search are used where one binary is used to find first occurrence and second binary is to find last occurrence
        int arr[] = {10, 20, 20, 20, 40, 40}, n = 6;

        int x = 20;

        System.out.println(countOcc(arr, n, x));

    }
}
