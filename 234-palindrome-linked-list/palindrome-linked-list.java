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
    public boolean isPalindrome(ListNode head) {
        ArrayList<Integer> help=new ArrayList<>();
        ListNode temp=head;
        while(temp!=null){
            help.add(temp.val);
            temp=temp.next;
        }
        ArrayList<Integer> rev=new ArrayList<>(help);
        Collections.reverse(rev);
        
        if(help.equals(rev)){
            return true;
        }
        return false;
    }
}