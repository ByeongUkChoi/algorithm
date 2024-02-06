class Solution {
    fun isMonotonic(nums: IntArray): Boolean {
        var increasing = true
        var decreasing = true
        for (i in 1 until nums.size) {
            if (nums[i] > nums[i - 1]) {
                decreasing = false
            }
            if (nums[i] < nums[i - 1]) {
                increasing = false
            }
        }
        return increasing || decreasing
    }
}