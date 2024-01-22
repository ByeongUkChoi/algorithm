class Solution {
    fun hasAlternatingBits(n: Int): Boolean {
        return n.toString(2).zipWithNext().all { (a, b) -> a != b }
    }
}