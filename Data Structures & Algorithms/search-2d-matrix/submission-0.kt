class Solution {
    fun searchMatrix(matrix: Array<IntArray>, target: Int): Boolean {

        for(row in matrix)
        {
            for(value in row)
            {
                if(value == target)
                {
                    return true 
                }
            }
        }
        return false 



    }
}
