class Solution {
    fun distributeCandies(candyType: IntArray): Int {
        return min(candyType.toSet().size, candyType.size / 2)
    }
}