package Array.MaxProfit;

public class Solution {
    public static int maxProfit(int[] prices) {
        int profit = 0;
        int min = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (min > prices[i]) {
                min = prices[i];
            }
            if (profit < prices[i] - min) {
                profit = prices[i] - min;
            }
        }
        return profit;
    }
    public static void main(String[] args) {
        int [] price = {7,1,5,3,6,4};
        System.out.println(maxProfit(price));
    }
}
