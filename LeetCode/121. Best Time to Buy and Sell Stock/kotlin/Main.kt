class Solution {
    fun maxProfit(prices: IntArray): Int {
        var minPrice = prices[0]
        var maxPrice = prices[0]
        var maxProfit = 0
        for (price in prices.drop(0)) {
            if (maxPrice < price) {
                maxPrice = price
                maxProfit = max(maxProfit, maxPrice - minPrice)
            }
            if (minPrice > price) {
                minPrice = price
                maxPrice = price
            }
        }
        return maxProfit
    }
}