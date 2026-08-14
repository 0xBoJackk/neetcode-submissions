/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
    fun reverseList(head: ListNode?): ListNode? {

        var pre : ListNode?= null
         var curr  =  head 
        
         while(curr != null)
         {
            val nex = curr.next
            curr.next = pre

            pre = curr
            curr = nex
         }
         return pre

    }
}
