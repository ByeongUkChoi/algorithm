class Solution {
    fun maxProduct(nums: IntArray): Int {
        var minProduct = nums.first()
        var maxProduct = nums.first()
        var maxInResult = maxProduct

        for (num in nums.drop(1)) {
            if (num < 0) {
                val temp = minProduct
                minProduct = maxProduct
                maxProduct = temp
            }

            maxProduct = maxOf(maxProduct * num, num)
            minProduct = minOf(minProduct * num, num)
            maxInResult = maxOf(maxInResult, maxProduct)
        }

        return maxInResult
    }
}