class Solution {
   fun longestConsecutive(nums: IntArray): Int {
    if (nums.isEmpty()) return 0

    nums.sort()

    var count = 1
    var seq = 1

    for (n in 1 until nums.size) {
        if (nums[n] == nums[n - 1]) { //dont use n+1 , cause arrayoutofboundexception
            continue
        }

        if (nums[n] - nums[n - 1] == 1) {
            count++
        } else {
            count = 1
        }

        seq = maxOf(seq, count)
    }

    return seq
}

}
