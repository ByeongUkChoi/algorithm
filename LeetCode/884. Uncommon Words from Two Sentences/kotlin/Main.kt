class Solution {
    fun uncommonFromSentences(s1: String, s2: String): Array<String> {
        return ("$s1 $s2")
            .split(" ")
            .groupingBy { it }
            .eachCount()
            .filter { it.value == 1 }
            .map { it.key }
            .toTypedArray()
    }
}