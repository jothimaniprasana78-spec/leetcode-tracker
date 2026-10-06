// Last updated: 10/6/2026, 4:03:31 PM
1class Solution {
2    public ListNode reverseBetween(ListNode head, int left, int right) {
3        ListNode dummy = new ListNode(0);
4        dummy.next = head;
5
6        ListNode prev = dummy;
7
8        for (int i = 1; i < left; i++) {
9            prev = prev.next;
10        }
11
12        ListNode curr = prev.next;
13
14        for (int i = 0; i < right - left; i++) {
15            ListNode next = curr.next;
16            curr.next = next.next;
17            next.next = prev.next;
18            prev.next = next;
19        }
20
21        return dummy.next;
22    }
23}