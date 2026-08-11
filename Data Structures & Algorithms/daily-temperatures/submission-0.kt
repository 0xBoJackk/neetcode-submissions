class Solution {
    fun dailyTemperatures(temperatures: IntArray): IntArray {

        var result = IntArray(temperatures.size)

        val stack = mutableListOf<Int>()

        for(i in temperatures.indices)
        {
            while(stack.isNotEmpty()&& temperatures[i] > temperatures[stack.last()])
            {
                val pDay =stack.removeAt(stack.lastIndex)
                result[pDay] = i - pDay
            }
            stack.add(i)
        }
        return result
        
       
    }
}
