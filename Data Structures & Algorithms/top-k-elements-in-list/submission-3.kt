class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {

      val map = HashMap<Int,Int>() 
      for (n in nums){map[n] = map.getOrDefault(n,0) +1// increment freq

    }
    val  sort =  map.entries.sortedByDescending{it.value}

    val result = IntArray(k)
    for(i in 0 until k) // dont add k  use until k 
    {
      result[i] = sort[i].key
    }

    return result 

      
}
}