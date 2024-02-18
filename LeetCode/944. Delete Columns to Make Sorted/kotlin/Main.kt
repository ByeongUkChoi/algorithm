class Solution {
    fun minDeletionSize(strs: Array<String>): Int {
        val length = strs[0].length
        val size = strs.size
        var chars: CharArray
        var total = 0
        for (i in 0 until length) {
            chars = CharArray(size)
            for ((j, str) in strs.withIndex()) {
                chars[j] = str[i]
            }
            val isEqual = chars.let { org -> org.clone().apply { sort() }.contentEquals(org) }
            if (!isEqual) {
                total++
            }
        }
        return total
    }
}