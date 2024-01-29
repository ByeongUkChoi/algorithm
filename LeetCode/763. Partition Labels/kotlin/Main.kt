class Solution {
    fun partitionLabels(s: String): List<Int> {
        val last = IntArray(26)
        for (i in s.indices) {
            last[s[i] - 'a'] = i
        }
        val ans = mutableListOf<Int>()
        var start = 0
        var end = 0
        for (i in s.indices) {
            end = Math.max(end, last[s[i] - 'a'])
            if (i == end) {
                ans.add(end - start + 1)
                start = end + 1
            }
        }
        return ans
    }
}