package search;

public class squareRoot {
    // time complexity O(log n)
    static int sqrRoot(int n){
            int ans = -1;
            int start = 1;
            int end = n;
            while (start<=end){
                int mid = start +(end-start)/2;
                int sqr= mid*mid; // finding square of middle element from start and end
                if(sqr==n){// if sqr is equal to number then mid is square root of number
                    return mid;
                }
                else if(sqr>n){ // if square of middle element is greater which means element is in left side
                    end = mid-1;
                }
                else {
                    start = mid+1; // if square of middle element smaller which means element is in right side
                    ans = mid; // we are storing mid as nearby value to square root of given number
                }
            }

        return ans;
    }

    public static void main(String[] args) {
        int num=25;
        System.out.println("Square root:"+sqrRoot(num));
    }
}
