/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
    fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {
    val nodes = mutableListOf<ListNode?>()
        var cur = head

        while (cur != null) {
            nodes.add(cur)
            cur = cur.next
        }

        val removeIndex = nodes.size - n
        if (removeIndex == 0) {
            return head?.next
        }

        nodes[removeIndex - 1]?.next = nodes[removeIndex]?.next
        return head
    }
}
