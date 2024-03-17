/* URL : https://leetcode.com/problems/reverse-linked-list/description/ */
class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode h1 = null;
        ListNode h2 = head;
        ListNode h3 = head.next;
        while(h3 != null) {
            h2.next = h1;
            h1 = h2;
            h2 = h3;
            h3 = h3.next;
        }
        h2.next = h1;
        return h2;
    }
}
