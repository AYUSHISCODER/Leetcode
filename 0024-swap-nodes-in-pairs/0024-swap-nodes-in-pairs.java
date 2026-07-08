/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) {
 *         this.val = val;
 *         this.next = next;
 *     }
 * }
 */
class Solution {

    public ListNode swapPairs(ListNode head) {
        return fun(head);
    }

    public ListNode fun(ListNode head) {
        int size = 2;

        if (head == null)
            return null;

        ListNode left = head;
        ListNode res = null;
        ListNode prevLeft = null;

        while (left != null) {

            ListNode right = left;

            for (int i = 1; i < size; i++) {
                if (right == null)
                    break;
                right = right.next;
            }

            if (right == null) {
                if (prevLeft != null)
                    prevLeft.next = left;
                break;
            }

            ListNode nextLeft = right.next;

            right.next = null;

            ListNode newHead = reverse(left);

            if (res == null)
                res = newHead;

            if (prevLeft != null)
                prevLeft.next = newHead;

            left.next = nextLeft;

            prevLeft = left;
            left = nextLeft;
        }

        return res == null ? head : res;
    }

    public ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }
}