class Solution {
    fun subsetsWithDup(nums: IntArray): List<List<Int>> {
        nums.sort()
        val subsets: HashSet<List<Int>> = HashSet()
        subsets.add(emptyList())

        for (num in nums) {
            val newSubsets = HashSet<List<Int>>()
            for (subset in subsets) {
                val newSubset = ArrayList(subset)
                newSubset.add(num)
                newSubsets.add(newSubset)
            }
            subsets.addAll(newSubsets)
        }

        return subsets.toList()
    }
}
