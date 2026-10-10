class Solution {
    fun isPalindrome(s: String): Boolean {
        val arry = s
            .filter { it.isLetterOrDigit() }
            .lowercase()

        return arry== arry.reversed()
    }
}