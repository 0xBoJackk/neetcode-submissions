class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {

        val bag = HashMap<String, MutableList<String>>()

        for (str in strs) {
            val word = str.toCharArray()
            word.sort()

            val original = String(word)

            if (!bag.containsKey(original)) {
                bag[original] = mutableListOf()
            }

            bag[original]!!.add(str)
        }

        return bag.values.toList()
    }
}