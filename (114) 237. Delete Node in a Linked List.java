/* URL : https://leetcode.com/problems/delete-node-in-a-linked-list/description/ */
class Solution {
    public void deleteNode(ListNode node) {
        ListNode fast = node.next;
        while(fast.next != null) {
            node.val = fast.val;
            fast = fast.next;
            node = node.next;
        }
        node.val = fast.val;
        node.next = null;
        return;
    }
}
