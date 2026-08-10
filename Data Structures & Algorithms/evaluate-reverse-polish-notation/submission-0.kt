import java.util.Stack

class Solution {
    fun evalRPN(tokens: Array<String>): Int {
        val stack = Stack<Int>()

        for (token in tokens) {
            if (token == "+" || token == "-" || token == "/" || token == "*") {
                val b = stack.pop()
                val a = stack.pop()

                val result = when (token) {
                    "+" -> a + b
                    "-" -> a - b
                    "*" -> a * b
                    "/" -> a / b
                    else -> 0
                }

                stack.push(result)
            } else {
                stack.push(token.toInt())
            }
        }

        return stack.peek()
    }
}