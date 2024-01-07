class Solution {
    fun missingNumber(nums: IntArray): Int {
        val n = nums.size
        val arr = nums.fold(BooleanArray(n + 1)) { acc, num ->
            acc.apply { this[num] = true }
        }
        return arr.indexOfFirst { !it }
    }
}