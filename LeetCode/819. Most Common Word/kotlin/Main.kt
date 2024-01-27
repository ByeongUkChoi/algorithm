class Solution {
    fun mostCommonWord(paragraph: String, banned: Array<String>): String {
        val words = paragraph.lowercase(Locale.getDefault()).split("[ !?',;.]+".toRegex()).filter { it != "" }
        val map = mutableMapOf<String, Int>()
        for (word in words) {
            if (word !in banned) {
                map[word] = map.getOrDefault(word, 0) + 1
            }
        }
        return map.maxBy { it.value }.key
    }
}