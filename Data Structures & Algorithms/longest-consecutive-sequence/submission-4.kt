class Solution {
   fun longestConsecutive(nums: IntArray): Int {
    if (nums.isEmpty()) return 0

    nums.sort()

    var count = 1
    var seq = 1

    for (n in 1 until nums.size) {
        if (nums[n] == nums[n - 1]) { //dont use n+1 , cause arrayoutofboundexception
        /*
        Array Index Out of Bounds: Occurs when accessing an index outside the valid range (`0` to `size - 1`).

`0 until nums.size` reaches the last index, so `nums[n + 1]` causes an error on the last iteration.

Fix: Use `0 until nums.size - 1` when accessing `nums[n + 1]`.

        */
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
