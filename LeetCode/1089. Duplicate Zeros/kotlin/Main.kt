class Solution {
    fun duplicateZeros(arr: IntArray): Unit {
        val clone = arr.clone()
        var j = 0
        for (i in clone.indices) {
            if (clone[i] == 0) {
                if (i + j >= arr.size) break
                arr[i + j] = clone[i]
                j++
            }
            if (i + j >= arr.size) break
            arr[i + j] = clone[i]
        }
    }
}
