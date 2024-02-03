class Solution {
    fun findShortestSubArray(nums: IntArray): Int {
        val map = mutableMapOf<Int, Int>()
        val first = mutableMapOf<Int, Int>()
        var degree = 0
        var result = 0
        for (i in nums.indices) {
            val num = nums[i]
            if (first[num] == null) {
                first[num] = i
            }
            map[num] = map.getOrDefault(num, 0) + 1
            if (map[num]!! > degree) {
                degree = map[num]!!
                result = i - first[num]!! + 1
            } else if (map[num] == degree) {
                result = Math.min(result, i - first[num]!! + 1)
            }
        }
        return result
    }
}