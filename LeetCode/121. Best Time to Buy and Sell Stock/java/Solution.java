class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int max = prices[0];
        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (max < prices[i]) {
                max = prices[i];
                maxProfit = Math.max(maxProfit, max - min);
            }
            if (min > prices[i]) {
                min = prices[i];
                max = prices[i];
            }
        }
        return maxProfit;
    }
}