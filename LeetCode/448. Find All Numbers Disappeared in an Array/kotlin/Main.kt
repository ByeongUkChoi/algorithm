class Solution {
    fun findDisappearedNumbers(nums: IntArray): List<Int> {
        val arr = IntArray(nums.size + 1)
        nums.forEach { num -> arr[num] = 1 }
        return arr.indices.filter { it != 0 && arr[it] == 0 }
    }
}
