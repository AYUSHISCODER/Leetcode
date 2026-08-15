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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int first=-1;
        int last=-1;
        ListNode prev=head;
        ListNode curr=prev.next;
int index=1;
int min=Integer.MAX_VALUE;
        while(curr.next!=null){
            ListNode next=curr.next;
            if((curr.val>prev.val && curr.val>next.val) || (curr.val<prev.val && curr.val<next.val)){
              if(first==-1){
                first=index;
              }
              else{
                min=Math.min(min,index-last);
              }
              last=index;

            }
            prev=curr;
            curr=next;
            index++;
        }
        int max=Integer.MIN_VALUE;
        max=Math.max(max,last-first);
        if(first==last){
            return new int[]{-1,-1};
        }
        else{
            return new int[]{min,max};
        }
    }
}