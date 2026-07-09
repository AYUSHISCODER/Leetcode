class Solution {
    public ListNode mergeNodes(ListNode head) {
        ListNode write = head;
        ListNode curr = head.next;
        int sum = 0;

        while (curr != null) {
            if (curr.val == 0) {
                write = write.next;
                write.val = sum;
                sum = 0;
            } else {
                sum += curr.val;
            }
            curr = curr.next;
        }

        write.next = null;

        return head.next;
    }
}