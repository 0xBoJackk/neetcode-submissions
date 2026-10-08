class Solution {

    fun encode(strs: List<String>): String {

        val bs = StringBuilder()
        for(str in strs ){


        bs.append(str.length)
        bs.append('^')
        bs.append(str)

    
    }
    return bs.toString()
    }

    fun decode(str: String): List<String> {

        var answer = mutableListOf<String>()

        var i = 0
        
        while(i in str.indices)
        {
            var j = i

            while(str[j] != '^')
            {

                j++}

            

            var bsLength = str.substring(i,j).toInt()

            var  word = str.substring(j+1, j+1+bsLength)

            answer.add(word)
        

        i = j+1+bsLength
        }


  return answer
    }
  
}
