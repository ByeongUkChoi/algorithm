class Solution {
    fun isOneBitCharacter(bits: IntArray): Boolean {
        var i = 0
        while (i < bits.size - 1) {
            i += if (bits[i] == 1) 2 else 1
        }
        return i == bits.size - 1
    }
}