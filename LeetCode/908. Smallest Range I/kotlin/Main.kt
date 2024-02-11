class Solution {
    fun smallestRangeI(nums: IntArray, k: Int): Int {
        val max = nums.max()
        val min = nums.min()
        val diff = max - min - 2 * k
        return if (diff < 0) 0 else diff
    }
}