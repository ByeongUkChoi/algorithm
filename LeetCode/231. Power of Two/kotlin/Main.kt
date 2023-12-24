class Solution {
    fun isPowerOfTwo(n: Int): Boolean {
        if (n == 0) return false
        var v = n;
        while (v % 2 == 0) v /= 2
        return v == 1;
    }
}