class Solution {
    fun lengthOfLongestSubstring(s: String): Int {

        val bag = HashSet<Char>()
        var l = 0 
        var count =  0

        for( i in s.indices)
        {
            while(s[i] in bag)
            {
                bag.remove(s[l])
                l++
            }
            bag.add(s[i])
            count = maxOf(count, i-l+1)
        }

        return count
    

    
    }
}