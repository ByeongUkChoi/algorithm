class Solution {
    fun addToArrayForm(num: IntArray, k: Int): List<Int> {
        val result = mutableListOf<Int>()
        var carry = k
        for (i in num.size - 1 downTo 0) {
            val sum = num[i] + carry
            result.add(0, sum % 10)
            carry = sum / 10
        }
        while (carry > 0) {
            result.add(0, carry % 10)
            carry /= 10
        }
        return result
    }
}