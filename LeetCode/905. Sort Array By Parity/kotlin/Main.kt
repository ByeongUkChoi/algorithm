class Solution {
    fun sortArrayByParity(nums: IntArray): IntArray {
        var left = 0
        var right = nums.size - 1
        while (left < right) {
            if (nums[left] % 2 != 0) {
                val temp = nums[left]
                nums[left] = nums[right]
                nums[right] = temp
                right--
            } else {
                left++
            }
        }
        return nums
    }
}