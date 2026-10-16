class Solution {
    fun checkInclusion(s1: String, s2: String): Boolean {
        if(s1.length > s2.length) return false

        val s1cnt = IntArray(26)
        val wincnt = IntArray(26)
        val winSze = s1.length

        for( c in s1)
        {
            s1cnt[c - 'a']++
        }

        for(right in s2.indices)
        {
            wincnt [s2[right] - 'a']++

        
        if(right >= winSze){
            wincnt[s2[right - winSze]- 'a']--

        }
        if(s1cnt.contentEquals(wincnt))
        {
            return true 
        }
        }

        return false


    }
}
