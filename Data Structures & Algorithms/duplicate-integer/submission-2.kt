class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {

        val bag  = HashSet<Int>()
         for(num in nums)
         {
            if(bag.contains(num))
            {
                return true
            }

            bag.add(num)
         }


         return false



}
}