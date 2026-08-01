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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode first=head;
        ListNode second=head.next;
        while(second!=null){
            int newVal=gcd(first.val,second.val);
            ListNode n=new ListNode(newVal);
            first.next=n;
            n.next=second;
            first=second;
            second=second.next;
        }
        return head;

    }
    public int gcd(int a,int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
}