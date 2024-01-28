class Solution {
    fun countPrimeSetBits(left: Int, right: Int): Int {
        val primes = setOf(2, 3, 5, 7, 11, 13, 17, 19)
        var count = 0
        for (i in left..right) {
            if (primes.contains(i.countOneBits())) {
                count++
            }
        }
        return count
    }
}