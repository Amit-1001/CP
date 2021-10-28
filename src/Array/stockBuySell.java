package Array;

public class stockBuySell {
    public static void main(String[] args) {
        // In this program we have to find max difference between stock price and add them together result in max profit
        int[] arr = {1,5,3,8,12}; // in this stock price at 1 and sell at 5 difference is 4 then again buy at 3 and sell at 8 difference is 5
        // buy at 8 and sell at 12 sum of whole value is 13
        int profit = 0;// initial profit

        for(int i = 1 ; i<arr.length; i++){
            if(arr[i]>arr[i-1]){
                profit = profit + (arr[i]-arr[i-1]);// profit variable store old price of stock
            }
        }
        System.out.println("Profit is :"+profit);

        System.out.println("Max profit is:"+   maxProfit(arr,0,arr.length-1));
    }

    static int maxProfit(int[] arr,int start, int end) {
 // this naive approach
        if(end<=start){
            return 0;
        }
        int profit =0;
        for(int i = start; i< end;i++){
            for(int j = i+1; j<=end;j++){
                if(arr[j]>arr[i]){
                    int curr_profit = arr[j]-arr[i] + maxProfit(arr,start,i-1)+maxProfit(arr,j+1,end);

                    profit = Math.max(profit,curr_profit);

                }
            }
        }
        return profit;
    }
}
