class Solution {
    fun singleNumber(nums: IntArray): IntArray {
        val frequencyMap = nums.groupBy { it }.mapValues { (_, values) -> values.size }
        return nums.filter { it -> frequencyMap.get(it) == 1 }.toIntArray()
    }
}
