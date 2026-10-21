class Solution {
    fun carFleet(target: Int, position: IntArray, speed: IntArray): Int {

        val cars =  position.indices.map{
            i -> Pair(position[i], speed[i])
        }
        .sortedByDescending{ it.first}

        var fleets = 0
        var fleettime  = 0.0 
        for((pos, spd ) in cars)
        {
             var time =  (target - pos).toDouble() / spd

             if(time > fleettime)
             {
                fleets++
                fleettime = time 
             }
        }

        return fleets

    
   
    }


}

