class Solution {
    fun isUgly(n: Int): Boolean {
        return when {
            n == 0 -> false
            n == 1 -> true
            n % 2 == 0 -> isUgly(n / 2)
            n % 3 == 0 -> isUgly(n / 3)
            n % 5 == 0 -> isUgly(n / 5)
            else -> false
        }
    }
}