class Solution {
    fun checkInclusion(s1: String, s2: String): Boolean {
        if (s1.length > s2.length) return false

        val s1Frequency: Map<Char, Int> = s1.groupingBy { it }.eachCount()
        val length = s1.length
        val s2Frequency = HashMap<Char, Int>()

        for (i in 0 until length) {
            s2Frequency[s2[i]] = s2Frequency.getOrDefault(s2[i], 0) + 1
        }

        for (i in 0..s2.length - length) {
            if (i > 0) {
                val prevChar = s2[i - 1]
                s2Frequency[prevChar] = s2Frequency[prevChar]!! - 1
                if (s2Frequency[prevChar] == 0) {
                    s2Frequency.remove(prevChar)
                }

                val newChar = s2[i + length - 1]
                s2Frequency[newChar] = s2Frequency.getOrDefault(newChar, 0) + 1
            }
            if (s1Frequency == s2Frequency) {
                return true
            }
        }
        return false
    }
}