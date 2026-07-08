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
    public ListNode rotateRight(ListNode head, int k) {
        return fun(head,k);
    }
    public ListNode fun(ListNode head,int k){
        if(head==null){
            return null;
        }
        
        ListNode t=head;
        ListNode last=head;
        int n=1;
        while(last.next!=null){
            last=last.next;
            n++;
                    }
       k=k%n;
       if(k==0){
        return head;
       }
       int c=n-k;
       int count=1;
       while(t!=null){
        if(count==c){
            break;
        }
        count++;
        t=t.next;
       }
       ListNode res=t.next;
       last.next=head;
       t.next=null;
       return res;


        
    }
}