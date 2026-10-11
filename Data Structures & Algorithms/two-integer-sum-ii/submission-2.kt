class Solution {
    fun twoSum(numbers: IntArray, target: Int): IntArray {

        val bag = HashMap<Int,Int>()

        for(i in numbers.indices)
        {
             val differ = target - numbers[i]

             if(bag.containsKey(differ))
             {
             return intArrayOf(bag[differ]!!+1 , i+1 )
        }

          bag[numbers[i]]=i


    }
    return intArrayOf()
    }
}
