class Solution {
    fun isAlienSorted(words: Array<String>, order: String): Boolean {
        val orderMap = order.withIndex().associate { it.value to it.index }

        fun isCorrectOrder(str1: String, str2: String): Boolean {
            for (i in 0 until Math.min(str1.length, str2.length)) {
                val order1 = orderMap[str1[i]] ?: Int.MAX_VALUE
                val order2 = orderMap[str2[i]] ?: Int.MAX_VALUE
                if (order1 != order2) return order1 < order2
            }
            return str1.length <= str2.length
        }

        for (i in 0 until words.size - 1) {
            if (!isCorrectOrder(words[i], words[i + 1])) return false
        }
        return true
    }
}