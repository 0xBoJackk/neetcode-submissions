class Solution {
    fun isValid(s: String): Boolean {

        var str = s
        while (str.contains("()") || str.contains("{}") || str.contains("[]")) {
            str = str.replace("()", "")
            str = str.replace("{}", "")
            str = str.replace("[]", "")
        }
        return str.isEmpty()


    }
}
