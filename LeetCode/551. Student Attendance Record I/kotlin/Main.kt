class Solution {
    fun checkRecord(s: String): Boolean {
        var absentCount = 0
        var consecutiveLateDays = 0
        for (c in s.toCharArray()) {
            if (c == 'L') {
                if (++consecutiveLateDays >= 3) {
                    return false
                }
            } else {
                consecutiveLateDays = 0
            }
            if (c == 'A') {
                if (++absentCount >= 2) {
                    return false
                }
            }
        }
        return true
    }
}