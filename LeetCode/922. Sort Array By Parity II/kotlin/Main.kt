class Solution {
    fun sortArrayByParityII(nums: IntArray): IntArray {
        val result = IntArray(nums.size)
        var evenIndex = 0
        var oddIndex = 1
        for (num in nums) {
            if (num % 2 == 0) {
                result[evenIndex] = num
                evenIndex += 2
            } else {
                result[oddIndex] = num
                oddIndex += 2
            }
        }
        return result
    }
}