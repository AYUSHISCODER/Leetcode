/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteMiddle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        if(head.next==null){
            head=null;
            return head;
        }
        while(fast!=null &&  fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode temp=head;
        while(temp.next!=slow && temp.next!=null){
          temp=temp.next;
        }
        if(temp.next!=null)
        temp.next=temp.next.next;
        return head;
    }
}