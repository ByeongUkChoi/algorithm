class Solution {
    fun maxProfit(prices: IntArray): Int =
        (1..<prices.size)
            .map { i -> prices[i] - prices[i - 1] }
            .sumOf { if (it > 0) it else 0 }
}