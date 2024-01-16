class Solution {
    fun containsNearbyDuplicate(nums: IntArray, k: Int): Boolean {
        val lastIndexMap = HashMap<Int, Int>()
        nums.forEachIndexed { index, num ->
            lastIndexMap[num]?.let { if (index - it <= k) return true }
            lastIndexMap[num] = index
        }
        return false
    }
}