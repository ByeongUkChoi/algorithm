class Solution {
    fun numJewelsInStones(jewels: String, stones: String): Int {
        return stones.toCharArray().count { jewels.contains(it) }
    }
}