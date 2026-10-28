class TimeMap {

    // Each key stores a list of (timestamp, value) pairs
    private val map = HashMap<String, MutableList<Pair<Int, String>>>()

    fun set(key: String, value: String, timestamp: Int) {

        // If the key doesn't exist, create an empty list
        if (!map.containsKey(key)) {
            map[key] = mutableListOf()
        }

        // Add the new timestamp and value
        map[key]!!.add(Pair(timestamp, value))
    }

    fun get(key: String, timestamp: Int): String {

        // If the key doesn't exist, return empty string
        if (!map.containsKey(key)) {
            return ""
        }

        val list = map[key]!!
        var result = ""

        // Check each timestamp-value pair
        for (entry in list) {

            val time = entry.first
            val value = entry.second

            // Keep the value if its timestamp is not in the future
            if (time <= timestamp) {
                result = value
            } else {
                // Timestamps are stored in increasing order
                break
            }
        }

        // Return the latest valid value
        return result
    }
}