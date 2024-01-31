class Solution {
    fun shortestToChar(s: String, c: Char): IntArray {
        val result = IntArray(s.length)
        val charIndex = mutableListOf<Int>()
        s.forEachIndexed { index, char ->
            if (char == c) {
                charIndex.add(index)
            }
        }

        s.forEachIndexed { index, char ->
            if (char == c) {
                result[index] = 0
            } else {
                var min = Int.MAX_VALUE
                charIndex.forEach {
                    val diff = Math.abs(it - index)
                    if (diff < min) {
                        min = diff
                    }
                }
                result[index] = min
            }
        }

        return result
    }
}