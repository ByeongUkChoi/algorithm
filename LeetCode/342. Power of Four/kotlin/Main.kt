class Solution {
    fun isPowerOfFour(n: Int): Boolean {
        if (n < 1) {
            return false
        }
        var n = n
        while (n >= 4) {
            if (n % 4 == 0) {
                n /= 4
            } else {
                break
            }
        }
        return n == 1
    }
}