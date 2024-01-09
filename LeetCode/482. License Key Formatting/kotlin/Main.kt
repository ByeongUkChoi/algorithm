class Solution {
    fun licenseKeyFormatting(s: String, k: Int): String =
        s.replace("-", "").uppercase(Locale.getDefault()).reversed().chunked(k).joinToString("-").reversed()
}