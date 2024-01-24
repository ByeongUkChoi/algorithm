class Solution {
    fun pivotIndex(nums: IntArray): Int {
        val length = nums.size
        if (length == 1) return 0
        val leftDp = IntArray(length)
        val rightDp = IntArray(length)

        var leftAcc = 0
        var rightAcc = 0
        for (i in 0 until length) {
            leftAcc += nums[i]
            val rightIdx = length - i - 1
            rightAcc += nums[rightIdx]
            leftDp[i] = leftAcc
            rightDp[rightIdx] = rightAcc
        }

        if (rightDp[1] == 0) return 0
        for (i in 1 until length - 1) {
            if (leftDp[i - 1] == rightDp[i + 1]) {
                return i
            }
        }
        return if (leftDp[length - 2] == 0) length - 1 else -1
    }
}