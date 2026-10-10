class Solution {
    fun isValidSudoku(board: Array<CharArray>): Boolean {

    val rows = Array(9) { mutableSetOf<Char>() }
    val cols = Array(9) { mutableSetOf<Char>() }
    val boxes = Array(9) { mutableSetOf<Char>() }

    for (row in 0 until 9) {
        for (col in 0 until 9) {

            val value = board[row][col]

            if (value == '.') continue

          
            if (rows[row].contains(value)) return false

            
            if (cols[col].contains(value)) return false

            
            val box = (row / 3) * 3 + (col / 3)

            // Check box
            if (boxes[box].contains(value)) return false

            // Store  value in all the sets
            rows[row].add(value)
            cols[col].add(value)
            boxes[box].add(value)
            /*
            val box = (row / 3) * 3 + (col / 3)


- row / 3 → identifies the box row (0–2).
- col / 3 → identifies the box column (0–2).
- (row / 3) * 3 + (col / 3) → calculates the unique box index (0–8).
            */
        }
    }

    return true
}
}
