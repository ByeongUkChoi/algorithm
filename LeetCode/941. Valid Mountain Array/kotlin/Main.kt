class Solution {
    fun validMountainArray(arr: IntArray): Boolean {
        var prevNum = arr[0]
        if (arr.size == 1 || prevNum > arr[1]) {
            return false
        }
        var goingUp = true
        for (num in arr.drop(1)) {
            if (num == prevNum) {
                return false
            }
            if (goingUp) {
                if (num < prevNum) {
                    goingUp = false
                }
            } else {
                if (num > prevNum) {
                    return false
                }
            }
            prevNum = num
        }
        return !goingUp
    }
}