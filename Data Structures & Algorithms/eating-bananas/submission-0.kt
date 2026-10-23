class Solution {
    fun minEatingSpeed(piles: IntArray, h: Int): Int {

        
        var left = 1
        var right = piles.maxOrNull()!!

        while (left < right) {
            val mid = left + (right - left) / 2

            if (canFinish(piles, mid, h)) {
                right = mid
            } else {
                left = mid + 1
            }
        }

        return left
    }

    fun canFinish(piles: IntArray, speed: Int, h: Int): Boolean {
        var hours = 0L

        for (pile in piles) {
            hours += Math.ceil(pile.toDouble() / speed).toLong()
        }

        return hours <= h
    }
}
