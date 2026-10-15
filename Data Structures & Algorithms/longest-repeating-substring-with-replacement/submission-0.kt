class Solution {
    fun characterReplacement(s: String, k: Int): Int {
        var left = 0
        var maxLength = 0
        var maxFreq = 0

        val count = mutableMapOf<Char, Int>()

        for (right in s.indices) {
            val ch = s[right]
            count[ch] = count.getOrDefault(ch, 0) + 1

            maxFreq = maxOf(maxFreq, count[ch]!!)

            while ((right - left + 1) - maxFreq > k) {
                val leftChar = s[left]
                count[leftChar] = count[leftChar]!! - 1
                left++
            }

            maxLength = maxOf(maxLength, right - left + 1)
        }

        return maxLength
    }
}