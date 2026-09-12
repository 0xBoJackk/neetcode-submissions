class Solution {
   
    fun search(nums: IntArray, target: Int): Int {
        return binarySearch(0, nums.size - 1, nums, target)
    }
     private fun binarySearch(l: Int, r: Int, nums: IntArray, target: Int): Int {
        if (l > r) {
            return -1
        }
        val m = l + (r - l) / 2

        return when {
            nums[m] == target -> m
            nums[m] < target -> binarySearch(m + 1, r, nums, target)
            else -> binarySearch(l, m - 1, nums, target)
        }
    }

}