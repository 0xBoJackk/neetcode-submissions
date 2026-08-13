class Solution {
    fun carFleet(target: Int, position: IntArray, speed: IntArray): Int {
    
   
    val cars = position.indices
        .map { i -> Pair(position[i], speed[i]) }
        
        .sortedByDescending { it.first }

    var fleets = 0

    
    var fleetTime = 0.0

    for ((pos, spd) in cars) {

      
        val time = (target - pos).toDouble() / spd

        if (time > fleetTime) {
            fleets++
            fleetTime = time
        }
    }

    return fleets
 }


}

