// Last updated: 7/9/2026, 10:51:04 AM
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0)
            return head;

        ListNode curr = head;
        int len = 1;

        while (curr.next != null) {
            curr = curr.next;
            len++;
        }

        curr.next = head;

        k = k % len;
        int steps = len - k;

        while (steps-- > 0)
            curr = curr.next;

        head = curr.next;
        curr.next = null;

        return head;
    }
}