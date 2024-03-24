/* URL : https://leetcode.com/problems/remove-linked-list-elements/ */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if(head == null) {
            return head;
        }
        if(head.val == val) {
            while(head != null && head.val == val) {
                head = head.next;
            }
        }
        if(head == null || head.next == null) {
            return head;
        }
        
        ListNode i = head;
        ListNode j = head.next;
        while(j != null) {
            if(j.val == val) {
                while(j != null && j.val == val) {
                    j = j.next;
                }
                i.next = j;
            }
            i = i.next;
            if(j != null) {
                j = j.next;
            }
        }
        
        return head;
    }
}
