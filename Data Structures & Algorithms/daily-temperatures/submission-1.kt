class Solution {
    fun dailyTemperatures(temperatures: IntArray): IntArray {

       val n = temperatures.size
       val res = mutableListOf<Int>()

       for(i in 0 until n)
       {
        var count = 1
        var j = i +1

        while(j < n ){
            if(temperatures[j] > temperatures[i])
            {
                break
            }
            j++
            count++
        }
        count = if(j == n) 0 else count 
        res.add(count)
       }

       return res.toIntArray()
       
    }
}
