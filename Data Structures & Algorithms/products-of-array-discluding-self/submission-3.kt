class Solution {
    fun productExceptSelf(nums: IntArray): IntArray {
        val ans = IntArray(nums.size)

        
        var prefix = 1
        for (i in nums.indices) {
            ans[i] = prefix
            prefix *= nums[i]
        }

        
        var suffix = 1
        for (i in nums.lastIndex downTo 0) {
            ans[i] *= suffix
            suffix *= nums[i]
        }

        return ans
    }
}
