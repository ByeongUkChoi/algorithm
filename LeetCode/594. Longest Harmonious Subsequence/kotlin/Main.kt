class Solution {
    fun findLHS(nums: IntArray): Int {
        val freqMap = nums.asSequence().groupingBy { it }.eachCount()
        return freqMap.asSequence()
            .mapNotNull { (k, v) -> freqMap[k + 1]?.let { v + it } }
            .maxOrNull() ?: 0
    }
}