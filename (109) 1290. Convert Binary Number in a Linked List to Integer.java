/* URL : https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/description/ */
class Solution {
    public int getDecimalValue(ListNode head) {
        return recursive(head, 0);
    }
    public int recursive(ListNode head, int res) {
        if (head == null) {
            return res;
        }
        return recursive(head.next, (res*2)+head.val);
        return head = null ? res : recursive(head.next, (res*2)+head.val);
    }
}
