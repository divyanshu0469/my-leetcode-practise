/* URL : https://leetcode.com/problems/remove-duplicates-from-sorted-list/ */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null){
            return head;
        } else if (head.next == null) {
            return head;
        }
        ListNode i = head;
        ListNode j = head.next;
        while(j != null) {
            if(i.val == j.val) {
                while(j != null && i.val == j.val) {
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
