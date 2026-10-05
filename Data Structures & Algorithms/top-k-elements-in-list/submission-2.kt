class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {

      val freqMap = HashMap<Int,Int>()  
      for(num in nums){
        freqMap[num] = freqMap.getOrDefault(num,0)+1
      }
      val sorted = freqMap.entries.sortedByDescending{it.value}

    val result = IntArray(k)
        for(i in 0 until k)
        {
            result[i] = sorted[i].key
        }

        return result
}
}