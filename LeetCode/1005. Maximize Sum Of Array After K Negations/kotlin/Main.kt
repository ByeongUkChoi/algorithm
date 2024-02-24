class Solution {
    fun largestSumAfterKNegations(nums: IntArray, k: Int): Int {
        nums.sort()
        var sum = 0
        var i = 0
        var k = k

        while (k > 0 && i < nums.size && nums[i] < 0) {
            nums[i] = -nums[i]
            k--
            i++
        }

        if (k % 2 != 0) {
            if (i < nums.size && (i == 0 || nums[i] < nums[i - 1])) {
                nums[i] = -nums[i]
            } else {
                nums[i - 1] = -nums[i - 1]
            }
        }

        return nums.sum()
    }
}