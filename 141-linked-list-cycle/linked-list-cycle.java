/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {   //using slow and fast pointer technique

    if(head==null) return false;

    ListNode slow= head;
    ListNode fast=head;

    while(fast!=null && fast.next!=null){ 
        slow= slow.next;                                 // slow ko 1 step pointer  move

        fast=fast.next.next;                             // fast ko 2 step pointer move

        if(slow==fast){      // agar slow and fast same point pe ho to then cycle form hogi 
            return true;
        }
    }
        return false;
    }
}