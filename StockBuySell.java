public class StockBuySell {
    public static int highestProfit(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }

        int lowPrice = prices[0];   
        int highestProfit = 0;          

        for (int i = 1; i < prices.length; i++) {
            
            if (prices[i] < lowPrice) {
                lowPrice = prices[i];
            }
            
            int profit = prices[i] - lowPrice;

            
            if (profit > highestProfit) {
                highestProfit = profit;
            }
        }

        return highestProfit;
    }

    public static void main(String[] args) {
        int[] prices = {56,90,22,45,10};
        System.out.println("highest Profit: " + highestProfit(prices)); 
    }
}
