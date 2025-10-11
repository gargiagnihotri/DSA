public class StockBuySell2 {
    public static int highestProfit(int[] prices) {
        int profit = 0;
        
        
        for (int m = 1; m < prices.length; m++) {
            if (prices[m] > prices[m - 1]) {
                profit += prices[m] - prices[m - 1];
            }
        }
        
        return profit;
    }

    public static void main(String[] args) {
        int[] prices1 = {11,77,55,33,65};
        System.out.println("highest Profit: " + highestProfit(prices1)); 

        int[] prices2 = {11,99,77,35,65};
        System.out.println("highest Profit: " + highestProfit(prices2)); 

        int[] prices3 = {22,99,33,65,77};
        System.out.println("highest Profit: " + highestProfit(prices3)); 
    }
}