class Solution {
    fun minWindow(s: String, t: String): String {

        if (t.length > s.length) return ""

        // Required frequency of each character in t
        val need = HashMap<Char, Int>()

        for (c in t) {
            need[c] = need.getOrDefault(c, 0) + 1
        }

        // Frequency of characters in the current window
        val window = HashMap<Char, Int>()

        var left = 0
        var have = 0

        // Number of distinct characters we must satisfy
        val required = need.size

        var minLength = Int.MAX_VALUE
        var start = 0

        // Expand the window using right
        for (right in s.indices) {
            val c = s[right]

            // Add the current character to the window
            window[c] = window.getOrDefault(c, 0) + 1

            // This character now meets its required frequency
            if (need.containsKey(c) &&
                window[c] == need[c]
            ) {
                have++
            }

            // When all required characters are satisfied,
            // try shrinking the window from the left
            while (have == required) {

                // Save this window if it is the shortest
                val length = right - left + 1

                if (length < minLength) {
                    minLength = length
                    start = left
                }

                // Remove the leftmost character
                val leftChar = s[left]
                window[leftChar] = window[leftChar]!! - 1

                // The character no longer meets its required frequency
                if (need.containsKey(leftChar) &&
                    window[leftChar]!! < need[leftChar]!!
                ) {
                    have--
                }

                // Shrink the window
                left++
            }
        }

        // Return the shortest window, or empty string if none exists
        return if (minLength == Int.MAX_VALUE) {
            ""
        } else {
            s.substring(start, start + minLength)
        }
    }
}