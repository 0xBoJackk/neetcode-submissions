
  class Solution {
    fun trap(height: IntArray): Int {
        if (height.isEmpty()) return 0

        val n = height.size
        val leftMax = IntArray(n)
        val rightMax = IntArray(n)

        // Build maximum heights from the left
        leftMax[0] = height[0]
        for (i in 1 until n) {
            leftMax[i] = maxOf(leftMax[i - 1], height[i])
        }

        // Build maximum heights from the right
        rightMax[n - 1] = height[n - 1]
        for (i in n - 2 downTo 0) {
            rightMax[i] = maxOf(rightMax[i + 1], height[i])
        }

        // Calculate trapped water at each index
        var water = 0

        for (i in 0 until n) {
            water += minOf(leftMax[i], rightMax[i]) - height[i]
        }

        return water
    }
}
