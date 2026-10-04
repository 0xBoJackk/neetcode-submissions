class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {

        val container = HashMap<Int,Int>()
        for(i in nums.indices){
            val answer = target - nums[i]


            if(container.containsKey(answer)){
                return intArrayOf(container[answer]!!,i)
            }
           container[ nums[i]] = i 
        }
        return intArrayOf()

    }
}