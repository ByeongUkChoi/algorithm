class Solution {
    fun isLongPressedName(name: String, typed: String): Boolean {
        val nameChars = name.toCharArray()
        val typedChars = typed.toCharArray()
        var i = 0
        var j = 0
        while (i < nameChars.size && j < typedChars.size) {
            if (nameChars[i] == typedChars[j]) {
                i++
                j++
            } else if (j > 0 && typedChars[j] == typedChars[j - 1]) {
                j++
            } else {
                return false
            }
        }
        while (j < typedChars.size) {
            if (typedChars[j] != typedChars[j - 1]) {
                return false
            }
            j++
        }
        return i == nameChars.size
    }
}