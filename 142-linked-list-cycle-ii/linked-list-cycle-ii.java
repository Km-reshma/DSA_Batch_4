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
    public ListNode detectCycle(ListNode head) {
        if(head==null || head.next==null)return null;
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){  //cycle is detect 
                ListNode curr =head;
                while(curr!=slow){
                    slow=slow.next; //slow ko 1 kadam chalao
                    curr=curr.next; //current ko 1 kadam chalao
                }
                return curr;
            }
        }
       return null;
        
    }
}