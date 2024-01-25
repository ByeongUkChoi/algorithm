class Solution {
    fun dominantIndex(nums: IntArray): Int {
        var max = intArrayOf(-1, -1)
        var secondMax = intArrayOf(-1, -1)

        nums.forEachIndexed { index, num ->
            if (num > max[0]) {
                secondMax = max
                max = intArrayOf(num, index)
            } else if (num > secondMax[0]) {
                secondMax = intArrayOf(num, index)
            }
        }

        return if (max[0] >= 2 * secondMax[0]) max[1] else -1
    }
}