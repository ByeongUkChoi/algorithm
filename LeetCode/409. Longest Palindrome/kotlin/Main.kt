class Solution {
    fun longestPalindrome(s: String): Int =
        s.length - (s.groupingBy { it }.eachCount().count { (_, v) -> v % 2 == 1 } - 1).coerceAtLeast(0)
}